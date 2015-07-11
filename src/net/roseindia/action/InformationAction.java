package net.roseindia.action;

import java.util.List;

import net.roseindia.Model.AddInformation;
import net.roseindia.dao.InformationDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class InformationAction extends ActionSupport implements ModelDriven {
	private AddInformation obAddInfo;
	private List infoList;
	private int id1;

	private InformationDAO obDao = new InformationDAO();

	@Override
	public String execute() throws Exception {
		this.infoList = obDao.list1();
		return SUCCESS;
	}

	public String add() {
		if (obAddInfo.getFirstname().equals("")||obAddInfo.getLastname().equals("")||obAddInfo.getGender().equals("")||obAddInfo.getAge().equals("")||obAddInfo.getAddress().equals("")) {
			addActionError("Please enter all valuees");
			return ERROR;
		}
		else
		{
			System.out.println(getId1());
		obDao.add(obAddInfo);
		System.out.println("Successdsifjsdf");
		return SUCCESS;
		}
	}

	public String delete() {
		System.out.println("Id : " + getId1());
		obDao.delete(getId1());
		System.out.println("Delete Success");
		return SUCCESS;
	}

	@Override
	public Object getModel() {
		obAddInfo = new AddInformation();
		return obAddInfo;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public List getInfoList() {
		return infoList;
	}

	public void setInfoList(List infoList) {
		this.infoList = infoList;
	}

}
