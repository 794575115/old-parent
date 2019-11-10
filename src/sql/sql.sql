drop table if exists t_admin;

/*==============================================================*/
/* Table: t_admin                                               */
/*==============================================================*/
create table t_admin 
(
   id                   int                            not null auto_increment,
   account              varchar(20)                    null,
   password             varchar(20)                    null,
   name                 varchar(20)                    null,
   constraint PK_T_ADMIN primary key clustered (id)
)charset=utf8;


drop table if exists t_emp;

/*==============================================================*/
/* Table: t_emp                                                 */
/*==============================================================*/
create table t_emp 
(
   id                   int                            not null  auto_increment,
   name                 varchar(32)                    null,
   work_number          varchar(32)                    null,
   password             varchar(32)                    null,
   birthday             date                           null,
   startday             date                           null,
   gender               boolean                        null,
   marital_status       int                            null,
   phone                varchar(32)                    null,
   email                varchar(32)                    null,
   birthplace_province  int                            null,
   birthplace_city      int                            null,
   political_outlook    int                            null,
   dept_id              int                            null,
   position_id          int                            null,
   status               int                            null,
   role_id              int                            null,
   constraint PK_T_EMP primary key clustered (id)
)charset=utf8;



drop table if exists t_dept;

/*==============================================================*/
/* Table: t_dept                                                */
/*==============================================================*/
create table t_dept 
(
   id                   int                            not null auto_increment,
   name                 varchar(32)                    null,
   description          text                           null,
   status               int                            null,
   constraint PK_T_DEPT primary key clustered (id)
)charset=utf8;



drop table if exists t_suggestion;

/*==============================================================*/
/* Table: t_suggestion                                          */
/*==============================================================*/
create table t_suggestion 
(
   id                   int                            not null auto_increment,
   title                varchar(32)                    null,
   send_time            datetime                       null,
   content              text                           null,
   emp_id               int                            null,
   constraint PK_T_SUGGESTION primary key clustered (id)
)charset=utf8;



drop table if exists t_replay;

/*==============================================================*/
/* Table: t_replay                                              */
/*==============================================================*/
create table t_replay 
(
   id                   int                            not null auto_increment,
   replay_time          datetime                       null,
   replay_empid         int                            null,
   content              text                           null,
   suggestion_id        int                            null,
   constraint PK_T_REPLAY primary key clustered (id)
)charset=utf8;




drop table if exists t_salary;

/*==============================================================*/
/* Table: t_salary                                              */
/*==============================================================*/
create table t_salary 
(
   id                   int                            not null auto_increment,
   salary_year          int                            null,
   salary_month         int                            null,
   base_salary          double                         null,
   insurance            double                         null,
   accumulation_fund    double                         null,
   tax                  double                         null,
   achievements         double                         null,
   really_salary        double                         null,
   emp_id               int                            null,
   constraint PK_T_SALARY primary key clustered (id)
)charset=utf8;





drop table if exists t_position;

/*==============================================================*/
/* Table: t_position                                            */
/*==============================================================*/
create table t_position 
(
   id                   int                            not null auto_increment,
   name                 varchar(32)                    null,
   description          text                           null,
   base_salary          double                         null,
   status               int                            null,
   dept_id              int                            null,
   constraint PK_T_POSITION primary key clustered (id)
)charset=utf8;





drop table if exists t_check_statistics;

/*==============================================================*/
/* Table: t_check_statistics                                    */
/*==============================================================*/
create table t_check_statistics 
(
   id                   int                            not null auto_increment,
   statistics_year      int                            null,
   statistics_month     int                            null,
   late_count           int                            null,
   leaveearly_count     int                            null,
   absenteeism_count    int                            null,
   absenteeismhalf_count int                            null,
   emp_id               int                            null,
   constraint PK_T_CHECK_STATISTICS primary key clustered (id)
)charset=utf8;






drop table if exists t_check;

/*==============================================================*/
/* Table: t_check                                               */
/*==============================================================*/
create table t_check 
(
   id                   int                            not null auto_increment,
   check_in             date                           null,
   check_out            date                           null,
   emp_id               int                            null,
   constraint PK_T_CHECK primary key clustered (id)
)charset=utf8;



drop table if exists t_role;

/*==============================================================*/
/* Table: t_role                                                */
/*==============================================================*/
create table t_role 
(
   id                   int                            not null auto_increment,
   name                 varchar(32)                    null,
   description          text                           null,
   constraint PK_T_ROLE primary key clustered (id)
)charset=utf8;




drop table if exists t_role_permission;

/*==============================================================*/
/* Table: t_role_permission                                     */
/*==============================================================*/
create table t_role_permission 
(
   role_id              int                            not null,
   permission_id        int                            not null,
   constraint PK_T_ROLE_PERMISSION primary key clustered (role_id, permission_id)
)charset=utf8;




drop table if exists t_permission;

/*==============================================================*/
/* Table: t_permission                                          */
/*==============================================================*/
create table t_permission 
(
   id                   int                            not null auto_increment,
   name                 varchar(32)                    null,
   description          text                           null,
   uri                  text                           null,
   constraint PK_T_PERMISSION primary key clustered (id)
)charset=utf8;



