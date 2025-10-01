 /* package java10k;

public class Duplicatenum {
	static int dup(int n){
        int dupnum=0;
        //int count =0;
        for(int i=n;i!=0;){
            int dig =i%10; //5
            boolean found =false;
            for(int dup1=dupnum;dup1!=0;) {
            
                	int dig1= dup1%10;
                	if(dig1==dig) {
                		found = true;
                		break;
                	}
                	 
                	dup1 = dup1/10;
                
            }
            if(!found) {
            	
            	dupnum= dupnum*10 +dig;
            }
            
            i=i/10;    
            
        }
        int rev = 0;
        for(int j=dupnum; j!=0; j/=10){
            rev = rev*10 + (j%10);
        }
        return rev;
    }
	//static int prime(int result) {
		int finalres=0;
		for(int i=result;i!=0;i/=10) {
			int dig=i%10;
			if(dig>2) {
				for(int j=2;j<n/2;j++) {
					if(n%j==0) {
						c++;
					}
				}
			}
			if(c==0) {
				
				finalres = finalres*10+dig;
			}
			
		}
	}
	//static int prime(in)
    public static void main(String[] args) {
        //int num=344255;
		int res= Duplicatenum.dup(344255);
        System.out.println(res);
    }

}
*/
