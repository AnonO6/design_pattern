package main

import (
	proxy_consumer "github.com/AnonO6/design_pattern/proxy/consumer"
	proxy_database "github.com/AnonO6/design_pattern/proxy/database"
)

func main() {
	consumer := proxy_consumer.Consumer{}
	
	db := proxy_database.NewDatabase("../design_pattern/proxy/db.json")
	cache := proxy_database.NewCache(*db)

	consumer.Process(cache)
}
