package Day3;

public class RetailStore {
		public int billId;
		public int customerId;
		public float discount;
		public float billAmount;

		public double calculateBillAmount(int billId,int customerId,float discount,float billAmount){
			float ba=billAmount-billAmount*(discount/100);
			System.out.println("Discounted billamount is : " +ba);
			return ba;
		}

		public static void main(String[] args) {
			RetailStore rs=new RetailStore();
			rs.calculateBillAmount(1001, 101, 0.02f, 199.99f);
			rs.calculateBillAmount(1002, 102, 0.04f, 210.5f);
		}
	}
