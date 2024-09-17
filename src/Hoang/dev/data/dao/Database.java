package Hoang.dev.data.dao;
import Hoang.dev.data.impl.Categoryimpl;
import Hoang.dev.data.impl.OrderItemimpl;
import Hoang.dev.data.impl.Orderimpl;
import Hoang.dev.data.impl.Productimpl;
import Hoang.dev.data.impl.Userimpl;
public class Database extends DatabaseDao {

    
    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return new Categoryimpl();
    }
    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return new OrderItemimpl();
    }
    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new Orderimpl();
    }
    @Override
    public UserDao getUserDao() {
        // TODO Auto-generated method stub
        return new Userimpl();
    }
	@Override
	public ProductDao getProductDao() {
		// TODO Auto-generated method stub
		return new Productimpl();
	}

}
