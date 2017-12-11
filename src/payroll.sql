create database payroll;
use payroll;
create table employees(EmployeeID varchar(10),
                DepartmentID varchar(10),
                AccountNumber varchar(50),
                Surname varchar(30),
                FirstName varchar(30),
                Gender char(5),
                PhoneNumber int(12),
                DateOfBirth date default '1900-00-00',
                DateOfHire date default '0000-00-00',
                Address varchar(10),
                JobGroup char(1),
                BasicSalary float(10,2),
                HouseAllowance float(10,2),
                TravelAllowance float(12,2),
                Deductions float(12,2),
                Tax float(15,2),
                NetSalary float(10,2),
                SSN varchar(15),
                AcademicQualification varchar(80),
                CurrentPosition varchar(100),
                EmployeeCategory varchar(50),
				primary key(EmployeeID),
				foreign key(AccountNumber) references banks(AccountNumber)
				);
				
create table Department(DepartmentID varchar(50),
						DepartmentName varchar(100),
						primary key(DepartmentID)
						);
						
create table paylogin(Surname varchar(20) NOT NULL,
			 password varchar(256) NOT NULL,
			 email varchar(256) NOT NULL,
			 phone int(12) NOT NULL
			 )ENGINE = MYISAM;
			 
create table banks(AccountNumber varchar(30),
BankID varchar(30),
BankName varchar(255),
AccountType varchar(255),
DateOpened date,
primary key (AccountNumber)
)ENGINE=InnoDB;			 
			 
insert into paylogin(Surname, password,email,phone)values ('Prof','prof@1989*','bonkewycliffe@yahoo.com','254763404086');
insert into department(DepartmentID,DepartmentName) values('ICT001','Information Communication Technology');
insert into banks(AccountNumber,BankID,BankName,AccountType,DateOpened) values('0020001457887','EQC002','Equity Bank Kenya Limited','SavingAccount','2017-01-28');
			
alter table paylogin modify column phone varchar(14);
alter table banks modify column AccountNumber primary key(AccountNumber);
alter table banks add primary key(AccountNumber);
alter table employees modify column PhoneNumber varchar(14);

alter table employees add column LatestSchool varchar(50);


insert into employees values('" + strEmpID + "','" + strDeptID + "','"+strAccountName+"','"+strSurname+
                    "','"+strFirstName+"','"+strGender+"','"+strPhoneNum+"','"+strDateOfBirth+"','"+strDateOfHire+"','"+strAddress+"','"+strJobGroup+
                    "','"+strBasicSal+"','"+strHouseAllowance+"','"+strTravelAll+"','"+strDeductions+"','"+strTotalTax+"','"+strNetSal+"','"+strEmpPin+
					"','"+AcademicQualification+"','"+CurrentPosition+"','"+EmployeeCategory+"','"+LatestSchool+"');
        
 


