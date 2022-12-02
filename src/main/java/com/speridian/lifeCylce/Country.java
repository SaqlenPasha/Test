package com.speridian.lifeCylce;

public class Country {
		private String CountryName;

		public String getCountryName() {
			return CountryName;
		}

		public void setCountryName(String countryName) {
			this.CountryName = countryName;
		}
		public void init() {
			System.out.println("In init block of country");
		}
		public void destroy()
		{
			System.out.println("In destroy block of country");
		}
}


//id in bean is an object and has a life cycle