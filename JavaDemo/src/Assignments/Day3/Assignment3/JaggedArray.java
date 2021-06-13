package Assignments.Day3.Assignment3;

public class JaggedArray {
    public static void main(String[] args) {
        String[][] skill = {{"Tony","Java","C","C++"},{"Thomas","Java","UNIX"},{"Dinil","Linux","Oracle"},{"Delvin","RDBMS","C#","Oracle"}};

        for (int row =0; row<skill.length; row++){
            if(skill[row][0] == "Delvin"){
                System.out.println("Skills Delvin has experience in:");

                for (int col = 1; col < skill[row].length; col++){
                    System.out.print(skill[row][col]+" ");
                }
                break;
            }
        }
    }
}
