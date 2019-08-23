package com.withAngular.demo.player;

import org.springframework.data.repository.CrudRepository;
/*import org.springframework.stereotype.Repository;*/

import com.withAngular.demo.Player;

// this will communicate with the database
/*@Repository*/ 
// because CrudRepository also have this
public interface PlayerRepository extends CrudRepository<Player, Integer> { //pass object type and primary key

}
