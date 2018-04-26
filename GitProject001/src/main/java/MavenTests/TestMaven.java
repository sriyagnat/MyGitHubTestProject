package MavenTests;

	import org.testng.Assert;
	import org.testng.annotations.Test;
	
public class TestMaven {

		@Test(description="This Test Method is for Addition",groups="Sanity",priority=1)
		public void AddTwo(){
			System.out.println("This method is Adding Two Numbers from TestNGLatest package -MathsTest");
			int a=30;
			int b=40;
			int SumTwo= a+b;
			Assert.assertEquals(SumTwo, a+b,"The Sum of Two numbers is correct");
		}
		
		@Test(priority=2)
		public void AddThree(){
				System.out.println("This method is forAdding three numbers from TestNGLatest package -MathsTest");
				int a=30;
				int b=40;
				int c=99;
				int Sum= a+b+c;
				Assert.assertEquals(Sum, a+b+c,"The Sum of Three numbers is correct");
		
		}
		
		@Test(priority=3)
		public void A(){
			System.out.println("This is just third Test Method to check for priority execution");
		}
	}
