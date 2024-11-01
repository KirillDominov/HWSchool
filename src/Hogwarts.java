public class Hogwarts {
    public void compare(HufflepuffStudents student1, HufflepuffStudents student2){
        if(student2 == student1){
            System.out.println(student1 + " и " + student2 + " один и тот же человек ");
        } else {
            int resultStudent1 = student1.getHardworking() + student1.getHonest() + student1.getLoyal();
            int resultStudent2 = student2.getHardworking() + student2.getHonest() + student2.getLoyal();
            if (resultStudent1 == resultStudent2) {
                System.out.println(student2 + " равен " + student1);
            } else if (resultStudent1 > resultStudent2) {
                System.out.println(student1 + " лучше чем " + student2);
            } else {
                System.out.println(student2 + " лучше чем " + student1);
            }
        }
    }
    public void compare(RavenclawStudents student1, RavenclawStudents student2){
        if(student2 == student1){
            System.out.println(student1 + " и " + student2 + " один и тот же человек ");
        } else {
            int resultStudent1 = student1.getFullOfCreativity() + student1.getWiseint() + student1.getSmart() + student1.getWitty();
            int resultStudent2 = student2.getFullOfCreativity() + student2.getWiseint() + student2.getSmart() + student2.getWitty();
            if (resultStudent1 == resultStudent2) {
                System.out.println(student2 + " равен " + student1);
            } else if (resultStudent1 > resultStudent2) {
                System.out.println(student1 + " лучше чем " + student2);
            } else {
                System.out.println(student2 + " лучше чем " + student1);
            }
        }
    }
    public void compare(GryffindorStudents student1, GryffindorStudents student2){
        if(student2 == student1){
            System.out.println(student1 + " и " + student2 + " один и тот же человек ");
        } else {
            int resultStudent1 = student1.getCourage() + student1.getNobility() + student1.getHonor();
            int resultStudent2 = student2.getCourage() + student2.getNobility() + student2.getHonor();
            if (resultStudent1 == resultStudent2) {
                System.out.println(student2 + " равен " + student1);
            } else if (resultStudent1 > resultStudent2) {
                System.out.println(student1 + " лучше чем " + student2);
            } else {
                System.out.println(student2 + " лучше чем " + student1);
            }
        }
    }
    public void compare(SlytherinStudents student1, SlytherinStudents student2){
        if(student2 == student1){
            System.out.println(student1 + " и " + student2 + " один и тот же человек ");
        } else {
            int resultStudent1 = student1.getAmbition() + student1.getaThirstForPower() + student1.getCunning() + student1.getDetermination();
            int resultStudent2 = student2.getAmbition() + student2.getaThirstForPower() + student2.getCunning() + student2.getDetermination();
            if (resultStudent1 == resultStudent2) {
                System.out.println(student2 + " равен " + student1);
            } else if (resultStudent1 > resultStudent2) {
                System.out.println(student1 + " лучше чем " + student2);
            } else {
                System.out.println(student2 + " лучше чем " + student1);
            }
        }
    }
    public void compare(HogwartsStudents student1, HogwartsStudents student2){
        if(student2 == student1){
            System.out.println(student1 + " и " + student2 + " один и тот же человек ");
        } else {
            int resultStudent1 = student1.getMagicPower() + student1.getTransgressionDistance();
            int resultStudent2 = student2.getMagicPower() + student2.getTransgressionDistance();
            if (resultStudent1 == resultStudent2) {
                System.out.println(student2 + " равен " + student1);
            } else if (resultStudent1 > resultStudent2) {
                System.out.println(student1 + " лучше чем " + student2);
            } else {
                System.out.println(student2 + " лучше чем " + student1);
            }
        }
    }
}