package day24_Array;

public class Unique {

    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4};
        String result="";
        for(int i=0; i<=arr.length-1;++i){
            int c=arr[i];
            int count=0;
              for(int k=0; k<=arr.length-1;++k){
                int each=arr[k];
                if(each==c) {
                    count++;
                }

            } if(count==1) { result +=c;
                System.out.print(c+ " ");
            }

        }


    }

}
