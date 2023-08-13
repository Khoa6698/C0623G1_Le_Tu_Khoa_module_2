package ss8_clean_code_refactoring.bai_tap.student_management.view;

import ss8_clean_code_refactoring.bai_tap.student_management.controller.CodeGymSystemManagermentController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Person;
import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Student;
import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Teacher;
import ss8_clean_code_refactoring.bai_tap.student_management.utils.Util;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private final CodeGymSystemManagermentController controller;

    public Menu(CodeGymSystemManagermentController controller) {
        this.controller = controller;
    }

    public void displayMenu() throws ParseException {
        int k = 0;
        boolean b = true;
        while (b) {
            System.out.println("----------------------------------------");
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN---");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addPerson();
                case 2 -> removePerson();
                case 3 -> displayPersons();
                case 4 -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please select again.");
            }

            k++;
            b = k < Integer.MAX_VALUE;
        }
    }

    private void addPerson() throws ParseException {
        System.out.println("Chọn loại người muốn thêm:");
        System.out.println("1. Học sinh");
        System.out.println("2. Giảng viên");
        int type = scanner.nextInt();
        scanner.nextLine();

        if (type == 1) {
            controller.addStudent(student());
            System.out.println("---------Học sinh mới đã được thêm---------");
        } else if (type == 2) {
            controller.addTeacher(teacher());
            System.out.println("---------Giảng viên mới đã được thêm---------");
        }
    }

    private Student student() throws ParseException {
        System.out.println("Nhập mã: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh(dd/MM/yyyy)");
        Date birthdate = Util.scanToDate(scanner.nextLine());
        System.out.println("Nhập giới tính");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        int typeSex = scanner.nextInt();
        scanner.nextLine();
        boolean isSex = Util.isConvertStringToSex(typeSex);
        System.out.println("Nhập tên lớp: ");
        String className = scanner.nextLine();
        System.out.println("Nhập số điểm: ");
        double score = scanner.nextDouble();
        scanner.nextLine();

        return new Student(id, name, birthdate, isSex, className, score);
    }

    private Teacher teacher() throws ParseException {
        System.out.println("Nhập mã: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh(dd/MM/yyyy)");
        Date birthdate = Util.scanToDate(scanner.nextLine());
        System.out.println("Nhập giới tính");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        int typeSex = scanner.nextInt();
        scanner.nextLine();
        boolean isSex = Util.isConvertStringToSex(typeSex);
        System.out.println("Nhập chuyên ngành: ");
        String major = scanner.nextLine();

        return new Teacher(id, name, birthdate, isSex, major);
    }

    private void removePerson() throws ParseException {
        System.out.println("Nhập mã học sinh hoặc giảng viên cần xóa: ");
        String id = scanner.nextLine();
        if (isExistPersonById(id)) {
            System.out.println("1. Yes");
            System.out.println("2. No");
            int type = scanner.nextInt();
            scanner.nextLine();
            if (type == 1) {
                controller.deletePerson(id);
            } else if (type == 2) {
                displayMenu();
            }
        } else {
            System.out.println("Mã học sinh hoặc giảng viên nhập vào không đúng");
            displayMenu();
        }
    }

    private void displayPersons() {
        List<Person> personList = controller.getPersonList();

        System.out.println("************************************");
        System.out.println("Danh sách giảng viên và học sinh:");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (Person person : personList) {
            System.out.println("Mã: " + person.getId());
            System.out.println("Tên: " + person.getName());
            System.out.println("Ngày sinh: " + dateFormat.format(person.getBirthDate()));
            System.out.println("Giới tính: " + (Boolean.TRUE.equals(person.getSex()) ? "Nam" : "Nữ"));

            if (person instanceof Student student) {
                System.out.println("Lớp: " + student.getClassName());
                System.out.println("Điểm số: " + student.getScore());
            } else if (person instanceof Teacher teacher) {
                System.out.println("Chuyên môn: " + teacher.getMajor());
            }
            System.out.println("************************************");
        }
    }

    private boolean isExistPersonById(String id) {
        List<Person> persons = controller.getPersonList();

        for (Person person : persons) {
            if (person.getId().equals(id)) {
                return true;
            }
        }

        return false;
    }
}