#1 What query would you run to get the total revenue for March of 2012?
SELECT MONTHNAME(charged_datetime)as month, SUM(amount) as revenue FROM billing
WHERE MONTH(charged_datetime) =3
AND YEAR(charged_datetime)=2012
;

#2 What query would you run to get total revenue collected from client=2
SELECT billing.client_id as client_id , SUM(billing.amount) as total_revenue FROM billing
WHERE billing.client_id=2
;

#3 What query would you run to get all the sites that client = 10 owns
SELECT sites.domain_name as website, sites.client_id FROM sites
WHERE sites.client_id=10
;

#4 .What query would you run to get total # of sites created each month for client=1 ? What about for client=20?
SELECT sites.client_id,COUNT(CONCAT(MONTHNAME(created_datetime),YEAR(created_datetime))) as sites_created,
MONTHNAME(sites.created_datetime) as  month_created, YEAR(sites.created_datetime) as year_created 
FROM sites 
WHERE sites.client_id=20
GROUP BY CONCAT(MONTH(sites.created_datetime),"/",YEAR(sites.created_datetime))
;

#5 What query would you run to get the total # of leads we have generated for each of our sites between January
# 1st 2011 to February 15th 2011
SELECT sites.domain_name as website, COUNT(sites.site_id) as number_of_leads,
DATE_FORMAT(leads.registered_datetime,"%M %d, %Y") as date_generated
FROM leads
JOIN sites ON leads.site_id= sites.site_id

WHERE leads.registered_datetime > "2011-01-01"
AND leads.registered_datetime< "2011-02-15"
GROUP BY sites.site_id
;

#6 What query would you run to get a list of client name and the total # of leads we have generated for each of our
#  client between January 1st 2011 to December 31st 2011

SELECT CONCAT(clients.first_name," ",clients.last_name) as client_name ,
COUNT(clients.client_id) as leads 
FROM clients
JOIN  sites ON clients.client_id = sites.client_id
JOIN leads ON sites.site_id= leads.site_id
WHERE leads.registered_datetime >= "2010-12-31" 
AND leads.registered_datetime < "2012-01-01"
GROUP BY clients.client_id
;


#7 What query would you run to get a list of client name and the total # of leads we have generated for each client
#  each month between month 1 - 6 of Year 2011

SELECT CONCAT(clients.first_name," ", clients.last_name) as client_name,
COUNT(clients.client_id) as leads, MONTHNAME(leads.registered_datetime)
FROM clients
JOIN sites ON clients.client_id=sites.site_id
JOIN leads ON sites.site_id= leads.site_id
WHERE MONTH(leads.registered_datetime)>=0
AND  MONTH(leads.registered_datetime) <=6
AND YEAR(leads.registered_datetime)=2011
GROUP BY clients.client_id, MONTH(leads.registered_datetime)
;

#8 What query would you run to get a list of client name and the total # of leads we have generated for each of
#our clients site between January 1st 2011 to December 31st 2011?
SELECT CONCAT(clients.first_name," ",clients.last_name) as client_name ,
sites.domain_name as website,
COUNT(clients.client_id) as leads ,
DATE_FORMAT(sites.created_datetime,"%M %d,%Y") as date_generated
FROM clients
JOIN  sites ON clients.client_id = sites.client_id
JOIN leads ON sites.site_id= leads.site_id
WHERE leads.registered_datetime >= "2010-12-31" 
AND leads.registered_datetime < "2012-01-01"
GROUP BY sites.site_id
ORDER BY clients.client_id
;


#9 Write a single query that retrieves total revenue collected from each client each month of the year?

SELECT CONCAT(clients.first_name," ",clients.last_name) as client_name ,
SUM(amount) as amount,
MONTHNAME(billing.charged_datetime) as month_charged,
YEAR(billing.charged_datetime) as year_charged  FROM clients
JOIN billing ON clients.client_id= billing.client_id
GROUP BY clients.client_id,MONTH(billing.charged_datetime),YEAR(billing.charged_datetime)
ORDER BY clients.client_id,YEAR(billing.charged_datetime),MONTH(billing.charged_datetime)
;

#10

