# Rooms module for my Hotel application

This module gives the room details for the other services and for the planned native application.

## Database:
Table **rooms**

Name | Type
------------ | -------------
hotelid | int NOT NULL
roomid | int NOT NULL
roomname |  varchar(50 NOT NULL
isitfree | boolean NOT NULL
smoking | boolean NOT NULL
datefrom | date
dateuntil | date


### Endpoints:

#### List all rooms

***Endpoint:*** {host}/v1/hotels/hotel/rooms

***Example:*** http://localhost:2224/v1/hotels/hotel/rooms
#### List rooms for a certain hotel
***Endpoint:*** {host}/v1/hotels/hotel/{hotelId}/rooms

Pathparams | Type
------------ | -------------
hotelId | int

***Example:*** http://localhost:2224/v1/hotels/hotel/1/rooms