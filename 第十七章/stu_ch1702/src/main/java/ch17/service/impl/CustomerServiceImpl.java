package ch17.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ch17.dao.CustomerDao;
import ch17.po.Customer;
import ch17.service.CustomerService;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	//注解注入CustomerDao
	@Autowired
	private CustomerDao customerDao;
	//查询客户
	public Customer findCustomerById(Integer id) {
		return this.customerDao.findCustomerById(id);
	}
}
