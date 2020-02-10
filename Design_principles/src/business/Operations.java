package business;

public class Operations {
    public String add(int n1,int n2)
    {
    	
    	int sum=n1+n2;
    	return String.valueOf(sum);
    }
   public String sub(int n1,int n2)
    {
    	int diff=n1-n2;
    	return String.valueOf(diff);
    }
    public String mul(int n1,int n2)
    {
    	int res=n1*n2;
    	return String.valueOf(res);
    }
   public String div(int n1,int n2)
    {
    	float dividend=n1/n2;
    	return String.valueOf(dividend);
    }
    
}
