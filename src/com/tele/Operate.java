package com.tele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 核心业务类
 */
public class Operate {
    private final List<Person> list;

    public Operate() {
        this.list = new ArrayList<>();
    }

    /**
     * 用户添加记录业务逻辑控制
     */
    public void addLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.addMenu();
            int item = telNoteRegex.menuItemValidate(1, 3);
            switch (item) {
                case 1:
                    this.addOperation();
                    break;
                case 2:
                    this.showAll();
                    break;
                case 3:
                    return;
            }
        }
    }

    /**
     * 用户查询记录业务逻辑控制
     */
    public void searchLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.searchMenu();
            int item = telNoteRegex.menuItemValidate(1, 7);
            switch (item) {
                case 1:
                    this.searchByName();
                    break;
                case 2:
                    this.searchByAge();
                    break;
                case 3:
                    this.searchBySex();
                    break;
                case 4:
                    this.searchByTelNum();
                    break;
                case 5:
                    this.searchByAdd();
                    break;
                case 6:
                    this.showAll();
                    break;
                case 7:
                    return;
            }
        }
    }

    /**
     * 修改记录业务逻辑控制
     */
    public void modifyLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.modifyMenu();
            int item = telNoteRegex.menuItemValidate(1, 3);
            switch (item) {
                case 1:
                    this.showAll();
                    break;
                case 2:
                    this.modifyOperation();
                    break;
                case 3:
                    return;
            }
        }
    }

    /**
     * 删除记录业务逻辑控制
     */
    public void deleteLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.deleteMenu();
            int item = telNoteRegex.menuItemValidate(1, 4);
            switch (item) {
                case 1:
                    this.showAll();
                    break;
                case 2:
                    this.deleteOperation();
                    break;
                case 3:
                    this.deleteAllOperation();
                    break;
                case 4:
                    return;
            }
        }
    }

    /**
     * 排序记录业务逻辑控制
     */
    public void orderLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.orderMenu();
            int item = telNoteRegex.menuItemValidate(1, 5);
            switch (item) {
                case 1:
                    this.orderName();
                    break;
                case 2:
                    this.orderAge();
                    break;
                case 3:
                    this.orderSex();
                    break;
                case 4:
                    this.showAll();
                    break;
                case 5:
                    return;
            }
        }
    }

    /**
     * 添加新记录信息
     */
    public void addOperation() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        String age = telNoteRegex.ageValidate();
        String sex = telNoteRegex.sexValidate();
        String telNum = telNoteRegex.telNumValidate();
        String address = telNoteRegex.addressValidate();
        Person person = new Person(name, age, sex, telNum, address);
        this.list.add(person);
        person.setId(this.list.size());
    }

    /**
     * 查询全部记录
     */
    public void showAll() {
        if (this.list.size() == 0) {
            System.out.println("没有任何记录");
            return;
        }
        for (Person one : this.list) {
            System.out.println(one);
        }
    }

    /**
     * 按姓名查询记录
     */
    public void searchByName() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        boolean flag = true;
        for (Person one : this.list) {
            if (name.equals(one.getName())) {
                System.out.println(one);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 按年龄查询记录
     */
    public void searchByAge() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String age = telNoteRegex.ageValidate();
        boolean flag = true;
        for (Person one : this.list) {
            if (age.equals(one.getAge())) {
                System.out.println(one);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 按性别查询记录
     */
    public void searchBySex() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String sex = telNoteRegex.sexValidate();
        boolean flag = true;
        for (Person one : this.list) {
            if (sex.equals(one.getSex())) {
                System.out.println(one);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 按电话号码查询记录
     */
    public void searchByTelNum() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String telNum = telNoteRegex.telNumValidate();
        boolean flag = true;
        for (Person one : this.list) {
            if (telNum.equals(one.getTelNum())) {
                System.out.println(one);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 按地址查询记录
     */
    public void searchByAdd() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String address = telNoteRegex.addressValidate();
        boolean flag = true;
        for (Person one : this.list) {
            if (address.equals(one.getAddress())) {
                System.out.println(one);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 修改指定记录
     */
    public void modifyOperation() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        Menu menu = new Menu();
        //对被修改的记录的序号进行验证，可以使用对菜单项验证的方法来完成
        System.out.println("请输入记录的序号");
        int itemNum = telNoteRegex.menuItemValidate(1, this.list.size());
        menu.subModifyMenu();
        int menuItem = telNoteRegex.menuItemValidate(1, 6);
        switch (menuItem) {
            case 1:
                String name = telNoteRegex.nameValidate();
                (this.list.get(itemNum - 1)).setName(name);
                break;
            case 2:
                String age = telNoteRegex.ageValidate();
                (this.list.get(itemNum - 1)).setAge(age);
                break;
            case 3:
                String sex = telNoteRegex.sexValidate();
                (this.list.get(itemNum - 1)).setSex(sex);
                break;
            case 4:
                String telNum = telNoteRegex.telNumValidate();
                (this.list.get(itemNum - 1)).setTelNum(telNum);
                break;
            case 5:
                String address = telNoteRegex.addressValidate();
                (this.list.get(itemNum - 1)).setAddress(address);
                break;
            case 6:
                break;
        }
    }

    /**
     * 删除指定记录
     */
    public void deleteOperation() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        System.out.println("请输入记录序号");
        int itemNum = telNoteRegex.menuItemValidate(1, this.list.size());
        this.list.remove(itemNum - 1);
        //重新为记录设置新的序号
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i + 1);
        }
        System.out.println("删除成功！请继续操作！");
    }

    /**
     * 删除全部记录
     */
    public void deleteAllOperation() {
        this.list.clear();
        System.out.println("电话中的记录已清空，请继续操作！");
    }

    /**
     * 按用户姓名排序记录
     */
    public void orderName() {
        this.list.sort(new orderByName());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i + 1);
        }
    }

    /**
     * 按用户年龄排序记录
     */
    public void orderAge() {
        this.list.sort(new orderByAge());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i + 1);
        }
    }

    /**
     * 按用户性别排序记录
     */
    public void orderSex() {
        this.list.sort(new orderBySex());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i + 1);
        }
    }

    /**
     * 按姓名排序的比较器
     */
    static class orderByName implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    /**
     * 按年龄排序的比较器
     */
    static class orderByAge implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }

    /**
     * 按性别排序的比较器
     */
    static class orderBySex implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getSex().compareTo(o2.getSex());
        }
    }
}
