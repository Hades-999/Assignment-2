class stblock {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block called ");
    }
    stblock(){
        System.out.println("Constructor called");
    }

    public static void main(String args[]) 
	{
	    stblock s1 = new stblock();
        stblock s2 = new stblock();
    }
}