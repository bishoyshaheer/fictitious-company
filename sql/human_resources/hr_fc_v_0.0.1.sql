Rem
Rem $Header: hr_fc_v_0.0.1.sql 25-may-2016
Rem
Rem hr_fc_v_0.0.1.sql
Rem
Rem    NAME
Rem      hr_fc_v_0.0.1.sql - update schema for fictitious-company project
Rem
Rem    DESCRIPTION
Rem
Rem    NOTES
Rem
Rem    CREATED by Bishoy Shaheer - 25/05/16
Rem
Rem    MODIFIED   (MM/DD/YY)
Rem

SET FEEDBACK 1
SET NUMWIDTH 10
SET LINESIZE 80
SET TRIMSPOOL ON
SET TAB OFF
SET PAGESIZE 100
SET ECHO OFF


REM **************************************************************************
REM procedure to add username and password to employees table
REM username same like first_name
REM password is password

PROMPT ***FICTITIOUS-COMPANY RELATED SCRIPT***

ALTER table employees
ADD (password VARCHAR2(50)
	,  username VARCHAR2(20)
  , CONSTRAINT     username_uk
                   UNIQUE (username));

UPDATE employees
SET password='password'
,   username=employee_id;

COMMIT;

