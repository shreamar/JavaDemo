package Assignments.Day2.Assignment10;

//1
class TypeCasting {
    public static void main(String[] args) {
        int intVal = 10;
        double doubelVal = 20.0;
        //Explicit casting is required
        intVal = (int)doubelVal;
        System.out.print(intVal);
    }
}

//2
class Demo{
    public static void main(String[] args) {
        if(true){
            System.out.println("True Block");
        }
        else{
            System.out.println("False block");
        }
    }
}

//3
class Example{
    public static void main(String[] args) {
        int intValOne = 0;
        int intValTwo = 0;
        for (short index =0; index<5;index++){
            if((++intValOne>2) || (++intValTwo>2)){
                intValOne++;
            }
        }
        System.out.println(intValOne+ " "+intValTwo);
    }
}

//4
class Example2{
    public static void main(String[] args) {
        int intValOne = 5, intValTwo = 7;
        System.out.println(((intValTwo*2)%intValOne));
        System.out.println(intValTwo%intValOne);
    }
}

//5
class Example3{
    public static void main(String[] args) {
        int val1 = 9;
        int val2 = 6;
        for (int val3 = 0;val3<6;val3++,val2--){
            if(val1>2){
                val1--;
            }
            if (val1>5){
                System.out.println(val1+" ");
                --val1;
                continue;
            }
            val1--;
        }
    }
}

//7
class SwitchCase{
    public static void main(String[] args) {
        String comment;
        int val = (int)(4*3);

        switch (val){
            case 0:comment = "Case 0";
            break;
            case 1:comment="Case 1";
            break;
            case 2:comment="Case 2";
            break;
            default:comment="Oops -- something went wrong";
        }
        System.out.println(comment);
    }
}
