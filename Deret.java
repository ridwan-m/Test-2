public class Deret{
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1 && i % 3 == 0){
            System.out.println("Indonesia");
            }else if(i % 2 == 0){
                System.out.println(i);
            }
            else{
                System.out.println("Ganjil");
            }

        }
    }
}
