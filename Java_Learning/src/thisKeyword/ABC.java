package thisKeyword;

class ABC{
	int i;
	ABC(int i){
		System.out.println(i);
		this.i = i;
	}
	public static void main(String ka[]){
		ABC obj = new ABC(10);
		System.out.println(obj.i);
	}
}