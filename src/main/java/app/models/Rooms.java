package app.models;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Gergely_Agnecz on 8/1/2017.
 */
@Entity
@Table(name = "rooms")
public class Rooms {


    @Column(name = "hotelid", nullable = false)
    private int hotelid;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roomid", nullable = false)
    private int roomid;
    @Column(name = "roomname", nullable = false)
    private String roomname;
    @Column(name = "price", nullable = false)
    private int price;
    @Column(name = "isitfree", nullable = false)
    private boolean isItFree;
    @Column(name = "smoking", nullable = false)
    private boolean smoking;
    @Column(name = "datefrom")
    private Date from;
    @Column(name = "dateuntil")
    private Date until;

    public int getHotelid() {
        return hotelid;
    }

    public void setHotelid(int hotelid) {
        this.hotelid = hotelid;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isItFree() {
        return isItFree;
    }

    public void setItFree(boolean itFree) {
        isItFree = itFree;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getUntil() {
        return until;
    }

    public void setUntil(Date until) {
        this.until = until;
    }
}
