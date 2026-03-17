package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Form {

	@Given("user open chrome")
	public void user_open_chrome() {
		System.out.println("Chrome Browser Open");
	}
	
	@Given("user navigate the url")
	public void user_navigate_the_url() {
		System.out.println("user navigated to some url");
	}
	
	@When("user enters details")
	public void user_enters_details(DataTable data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		

       List<List<String>> li =data.asLists();
       //System.out.println(li.get(0).get(1));
       String fname = li.get(0).get(0);
       String phone=li.get(0).get(1);
       System.out.println(fname);
       System.out.println(phone);
       
	}
	



}
