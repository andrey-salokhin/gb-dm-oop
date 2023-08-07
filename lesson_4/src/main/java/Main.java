public class Main {
    public static void main(String[] args) {
        // GBList<Integer> list = new GBArrayList<>();
        // System.out.println(list.size());
        // list.add(12);
        // list.add(65);
        // list.add(846);
        // System.out.println(list.size());
        // System.out.println(list.get(1));
        // System.out.println(list.get(2));
        // list.update(2, 43);
        // System.out.println(list.get(2));
        // list.add(33);
        // System.out.println(list);
        // System.out.println();
        // list.remove(2);
        // System.out.println(list);
        // System.out.println(list.size());

//        GBList<String> strList = new GBArrayList<>();
//        strList.add("aaa");
//        strList.add("bbbb");
//        System.out.println(strList.get(1));


        GBList<String> strLinkedList = new GBLinkedList<>();
        strLinkedList.add("Test");
        strLinkedList.add("Test2");
        System.out.println(strLinkedList.getFullElement(0));
        strLinkedList.update(0, "New test");
        System.out.println(strLinkedList.getFullElement(1));
        strLinkedList.add("Test3");
        strLinkedList.add("Test4");
        System.out.println(strLinkedList.getFullElement(2));
        strLinkedList.remove(2);
        System.out.println("-------------------");
        System.out.println(strLinkedList.getFullElement(0));
        System.out.println(strLinkedList.getFullElement(1));
        System.out.println(strLinkedList.getFullElement(2));
        System.out.println("-------------------");
        strLinkedList.addFirst("TestZero");
        System.out.println(strLinkedList.getFullElement(0));


        GBList<Integer> strIntgerList = new GBLinkedList<>();
        strIntgerList.add(1);
        strIntgerList.add(2);
        System.out.println(strIntgerList.getFullElement(0));
        // System.out.println(strIntgerList.getFullElementTest(0));

    }
}
