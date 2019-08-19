package Other;

public class isString {
	// 3 loại
	// String, StringBuilder, StringBuffer

	// Sinh nhị phân, 3 loại string ( String, StringBuilder, StringBuffer)
	// Sinh nhị phân: Basic, Advance
	// Khi nào thì sài, trường hợp cơ bản ( sinh các số nhị phân, k phân ), trường
	// hợp nâng cao ( Áp dụng sinh nhị phân với những trường hợp khác )

	// 3 loại string:
	// Sự giống và khác của 3 loại.
	// Khi nào nên sài loại nào
	// Một số hàm thường được sử dụng của 3 loại
	public static void main(String[] args) {
//		String bình thường: bất biến ( không thể thay đổi được) : có thể thêm vào
//		StringBuilder - StringBuffer: thường được sử dụng ở trong đa luồng. 2 thằng này nhanh hơn so với String bình thường
//		StringBuilder < StringBuffer < String: StringBuilder nhanh nhất
//		StringBuffer: được đồng bộ, StringBuilder thì không

		String x = "ab145cdsadwq145sadas";
		
		StringBuffer xx = new StringBuffer(x);

//		[begin, end): xóa từ vị trí begin cho tới vị trí trước end
		System.out.println(xx.delete(2,4));
		
		xx.toString(); // chuyển từ StringBuilder / Buffer sang String
		
		System.out.println(xx.toString().indexOf("145"));
		
	}
}
