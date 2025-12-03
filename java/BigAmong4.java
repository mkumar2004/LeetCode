public class BigAmong4{
    public static void main(String args[]){
        int a =12,b=8,c=19,d=1;

        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("A is big");
                }
                else{
                    System.out.println("d is big");
                }
            }
            else{
                if(c>d){
                    System.out.println("C is big");
                }
                else{
                    System.out.println("D is big");
                }
            }
        }
        else{
        if(b>c){
                if(b>d){
                    System.out.println("B is big");
                }
                else{
                    System.out.println("d is big");
                }
            }
            else{
                if(c>d){
                    System.out.println("C is big");
                }
                else{
                    System.out.println("D is big");
                }
            }
        }
    }
}