public class Colony {
   public static  void ceilCompete(int arr[],int day){
        int U[]=new int[8];
        for(int i=1;i<=day;i++){
            if(i>1){
                arr =U;
                U=new int[8];
            }
            for(int j=0;j<arr.length;j++){
                if(j==0||j==7){
                    if(arr[1]==0||arr[6]==0){
                        U[j]=0;

                    }
                    else{
                        U[j]=1;
                    }
                }
                else if(arr[j-1]==arr[j+1])
                {
                 U[j]=0;

                }
                else {
                    U[j]=1;
                }
        
        }
    }
    for(int i =0;i<arr.length;i++){
        System.out.print(U[i]+" ");
    }
    }
    public static void main(String[] args) {
        Colony k= new Colony();
        int arr[]={1,1,1,0,1,1,1,1};
        ceilCompete(arr, 2);
        
    }
    
}
