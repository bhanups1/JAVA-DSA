package Arrays;

// Passing arrays as argument

public class lecture_2 {
    public static void update(int marks[] ) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {98, 99, 98};
        int nonChangable = 5;
        update(marks );
        System.out.println(nonChangable);

        // print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        
    
    }
}
