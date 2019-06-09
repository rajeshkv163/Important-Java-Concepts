package gof_design_patterns.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository();

        for(Iterator i = nameRepository.getIterator(); i.hasNext();) {
            String name = (String) i.nextName();
            System.out.println("Name : " + name);
        }
    }
}