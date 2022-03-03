create table Account
(
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null,
	pass nvarchar(255) null,
	isAdmin bit null
)

create table TypeNews
(
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null
)

create table News
(
	id int not null identity(1,1) primary key,
	title nvarchar(255) null,
	img nvarchar(255) null,
	[date] date null,
	[description] nvarchar(255) null,
	content nvarchar(255) null,
	typeId int null
)

create table [Nationality]
(
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null,
	img nvarchar(255) null
)

create table Player
(
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null,
	img nvarchar(255) null,
	dob date null,
	birthPlace nvarchar(255) null,
	nationalityId int null,
	height int null,
	weight int null,
	roleId int null,
	number int null,
	imgBack nvarchar(255) null,
	description nvarchar(255) null,
	infor text null
)

 create table PlayerRole
 (
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null
 )

 create table Tournament
 ( 
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null,
	img nvarchar(255) null
 )
 create table Coach
 (
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null,
	img nvarchar(255) null,
	nationalityId int null,
	roleId int null,
	imgBack nvarchar(255) null,
	[description] nvarchar(255) null,
	infor text null
 )
 create table CoachRole
 (
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null
 )
 create table [Match]
 (
	id int not null identity(1,1) primary key,
	dateMatch date null,
	tournamentId int null,
	homeId int null,
	awayId int null
 )
 create table MyOpponent
 (
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null,
	img nvarchar(255) null
 )
 create table MyTeam
 (
	id int not null identity(1,1) primary key,
	[name] nvarchar(255) null,
	img nvarchar(255) null
 )