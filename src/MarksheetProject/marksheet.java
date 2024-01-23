package MarksheetProject;

class marksheet {
    private String name, fathername;
    private long enrollment;
    private int n, total, per;
    marksheet(String name, String fathername, long enrollment, int n, int total, int per) {
        this.name = name;
        this.fathername = fathername;
        this.enrollment = enrollment;
        this.n = n;
        this.total = total;
        this.per = per;
    }

    public void studinfo() {
        System.out.println("Full name:   " + name);
        System.out.println("Fathername:  " + fathername);
        System.out.println("Enrollment:  " + enrollment);
        System.out.println("No of Subjects: "+ n);
        System.out.println("Total:  " + total);
        System.out.println("Percentage:  " + per + "%");
        if (per < 30) {
            System.out.println("Grade: F");
        } else if (per < 50) {
            System.out.println("Grade: D");
        } else if (per < 65) {
            System.out.println("Grade: C");
        } else if (per < 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: A");
        }
    }

}
