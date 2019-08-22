package com.withAngular.demo.player;

import org.springframework.data.repository.CrudRepository;
/*import org.springframework.stereotype.Repository;*/

// this will communicate with the database
/*@Repository*/ 
// because CrudRepository also have this
public interface PlayerRepository extends CrudRepository<Player, Integer> { //pass object type and primary key

}
