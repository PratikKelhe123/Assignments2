package com.training;

public class VehicleInsurance extends Insurance {

	private String vehicleModel;
	private int costOfManufacture;
	private int yearOfManufacture;
	
	public VehicleInsurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount) {
		super(policyNumber, policyHolderName, policyHolderAge, insuredAmount);
		// TODO Auto-generated constructor stub
	}
	public VehicleInsurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount,
			String vehicleModel, int costOfManufacture, int yearOfManufacture) {
		super(policyNumber, policyHolderName, policyHolderAge, insuredAmount);
		this.vehicleModel = vehicleModel;
		this.costOfManufacture = costOfManufacture;
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getCostOfManufacture() {
		return costOfManufacture;
	}
	public void setCostOfManufacture(int costOfManufacture) {
		this.costOfManufacture = costOfManufacture;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	@Override
	public double calulatePremium() {
		// TODO Auto-generated method stub
		
		if( this.vehicleModel.equals("Two") ) {
			if(this.yearOfManufacture-2020 < 2) {
			return 0.5*this.getInsuredAmount();
			}
		else {
			return 0.6*this.getInsuredAmount();
		}}else {
			if(this.yearOfManufacture-2020 < 2) {
				return 0.4*this.getInsuredAmount();
				}
			else {
				return 0.*this.getInsuredAmount();
			}
		}
		
	
	
	}
	
	

}
