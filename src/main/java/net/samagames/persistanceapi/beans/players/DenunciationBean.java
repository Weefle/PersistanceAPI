/*
===============================================================
   _____                       ______
  / ___/____ _____ ___  ____ _/ ____/___ _____ ___  ___  _____
  \__ \/ __ `/ __ `__ \/ __ `/ / __/ __ `/ __ `__ \/ _ \/ ___/
 ___/ / /_/ / / / / / / /_/ / /_/ / /_/ / / / / / /  __(__  )
/____/\__,_/_/ /_/ /_/\__,_/\____/\__,_/_/ /_/ /_/\___/____/

===============================================================
  Persistance API
  Copyright (c) for SamaGames, all right reserved
  By MisterSatch, January 2016
===============================================================
*/

package net.samagames.persistanceapi.beans.players;

import java.sql.Timestamp;
import java.util.UUID;

public class DenunciationBean
{
    /* Database Structure

    Table : denunciation
    +-----------------+--------------+------+-----+---------------------+----------------+
    | Field           | Type         | Null | Key | Default             | Extra          |
    +-----------------+--------------+------+-----+---------------------+----------------+
    | denouncement_id | int(11)      | NO   | PRI | NULL                | auto_increment |
    | denouncer       | binary(16)   | NO   |     | NULL                |                |
    | date            | timestamp    | NO   |     | 0000-00-00 00:00:00 |                |
    | reason          | varchar(255) | NO   |     | NULL                |                |
    | suspect_name    | varchar(255) | NO   |     | NULL                |                |
    +-----------------+--------------+------+-----+---------------------+----------------+
    */

    // Defines
    private long denoucementId;
    private UUID denoucer;
    private UUID suspect;
    private Timestamp date;
    private String reason;
    private String suspectName;

    // Constructor
    public DenunciationBean(UUID denoucer, Timestamp date, String reason, String suspectName)
    {
        this.denoucer = denoucer;
        this.date = date;
        this.reason = reason;
        this.suspectName = suspectName;
    }

    // Getters
    public long getDenoucementId() { return denoucementId; }
    public UUID getDenoucer() { return denoucer; }
    public Timestamp getDate() { return date; }
    public String getReason() { return reason; }
    public String getSuspect_name() { return suspectName; }

    // Setters
    public void setDenoucer(UUID denoucer) { this.denoucer = denoucer; }
    public void setDate(Timestamp date) { this.date = date; }
    public void setReason(String reason) { this.reason = reason; }
    public void suspectName(String suspectName) { this.suspectName = suspectName; }

}