package com.mkpits.collections;

import java.util.Objects;

public class ModelClassArrayList {


		private int rollNo;
		private  String name;
		
		 
		
		public ModelClassArrayList(int rollNo, String name) {
			super();
			this.rollNo = rollNo;
			this.name = name;
		}
		protected int getRollNo() {
			return rollNo;
		}
		protected String getName() {
			return name;
		}
		protected void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		protected void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "ModelClassArrayList [rollNo=" + rollNo + ", name=" + name + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(name, rollNo);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ModelClassArrayList other = (ModelClassArrayList) obj;
			return Objects.equals(name, other.name) && rollNo == other.rollNo;
		}
		 
		
		 
		

	}


