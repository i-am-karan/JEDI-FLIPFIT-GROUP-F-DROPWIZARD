create database FlipFitSchema;
use FlipFitSchema;
create table Booking(
                        bookingID int primary key auto_increment,
                        userID int not null,
                        slotTime int not null,
                        slotID int not null,
                        isDeleted bool not null
);

create table GymAdmin(
                         adminID int primary key auto_increment,
                         roleID int,
                         emailID varchar(45) not null,
                         password varchar(45) not null
);

create table User(
                     userID int primary key auto_increment,
                     userName varchar(255) not null,
                     roleID int,
                     emailID varchar(45) not null,
                     phoneNumber varchar(45) not null,
                     password varchar(255) not null
);

create table Customer(
                         customerID int primary key,
                         city varchar(255) not null,
                         pincode varchar(45) not null,
                         foreign key (customerID) references User(userID)
);

create table GymOwner(
                         ownerID int primary key,
                         PAN varchar(255) not null,
                         Aadhar varchar(255) not null,
                         GSTIN varchar(255) not null,
                         approved bool not null,
                         foreign key (ownerID) references User(userID)
);

create table GymCentre(
                          centreID int primary key auto_increment,
                          ownerID int not null,
                          capacity int not null,
                          approved bool not null,
                          city varchar(255) not null,
                          state varchar(255) not null,
                          pincode varchar(45) not null,
                          foreign key (ownerID) references GymOwner(ownerID)
);

create table Slots(
                      slotID int primary key auto_increment,
                      centreID int not null,
                      seatsAvailable int not null,
                      slotTime int not null,
                      foreign key (centreID) references GymCentre(centreID)
);

create table Payments(
                         paymentID int primary key auto_increment,
                         userID int not null,
                         paymentType int not null,
                         paymentInfo varchar(255) not null,
                         foreign key (userID) references Customer(customerID)
);