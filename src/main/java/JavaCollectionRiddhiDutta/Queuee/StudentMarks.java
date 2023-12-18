package JavaCollectionRiddhiDutta.Queuee;

public class StudentMarks implements Comparable<StudentMarks> {

    private int maths;
    private int physics;

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(StudentMarks o) {

        System.out.println("Comparable compareTo() is called");

 /*       case 1:current object<other object
                    return -1;
                    here it can be any negative number

          case 2:current object>other object
                    return 1;
                    here it can be any positive number

          case 3:current object==other object
                         return 0;
            */

/*      if(this.maths<o.maths){
           return -1;
        }
        if(this.maths>o.maths){
            return 1;
        }
        if(this.maths==o.maths){
            return 0;
        }*/
//        this 3 line and conditions can be summed up in 1 line

        //top elements should be first so more maths marks it should be first
        return o.maths-this.maths;



    }
}
