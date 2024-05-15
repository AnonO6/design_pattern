package proxy_consumer

import (
	"log"
	"time"

	proxy_database "github.com/AnonO6/design_pattern/proxy/database"
)

type Consumer struct {
}

func (consumer Consumer) Process(database proxy_database.IDatabase) {
	log.Print("init")

	database.Set(proxy_database.Input{
		Id:      "1",
		Content: "good afternoon!",
	})

	log.Print(database.Get("1"))

	log.Print(database.Get("1"))

	database.Set(proxy_database.Input{
		Id:      "1",
		Content: "good evening!",
	})

	log.Print(database.Get("1"))

	time.Sleep(2 * time.Second)
	log.Print(database.Get("1"))

	time.Sleep(2 * time.Second)
	log.Print(database.Get("1"))
}
