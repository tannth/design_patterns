package example.two_interface;

import example.two_interface.builder.OrderBuilder;
import example.two_interface.builder.OrderDirector;
import example.two_interface.builder.SaxHandler;
import example.two_interface.factory.BuilderFactory;

public class OrderShoppingTest {

	public static final String xmlFile = "order.xml";
	public static final String CAO = "California orders";
	public static final String NONCAO = "Non-California orders";
	public static final String OSO = "Overseas orders";

	public static final int TOTAL_AMOUNT = 100;

	static OrderBuilder builder;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuilderFactory factory = new BuilderFactory();
		// create an appropriate builder instance
		builder = factory.getOrderBuilder(OrderShoppingTest.OSO);
		// configure the director with the builder
		OrderDirector director = new OrderDirector(builder);
		director.pasre("order.xml");
		for (Order s : SaxHandler.listOrder) {
			System.out.println("Ten sach:" + s.getItems());

		}

		// director.build(director.getResult().toString());

		// Order order = builder.getOrder();
		// order.save();
		//
		// System.out.println(director.getResult().toString());

	}
}
