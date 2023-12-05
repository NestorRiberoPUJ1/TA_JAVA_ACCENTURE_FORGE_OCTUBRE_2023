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

#10 Write a single query that retrieves all the sites that each client owns. Group the results so that each row shows
# a new client and have a new field called 'sites' that has all the sites that the client owns
SELECT CONCAT(clients.first_name," ",clients.last_name) as client_name,
GROUP_CONCAT(sites.domain_name SEPARATOR " / ") as websites
FROM clients
JOIN sites ON clients.client_id = sites.client_id
GROUP BY clients.client_id
ORDER BY clients.client_id
;


