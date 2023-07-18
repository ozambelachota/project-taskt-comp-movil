package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBTask extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "TaskDataBase.db";
    private static final int DATABASE_VERSION =1;


    public DBTask(@Nullable Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTaskTableQuery = "CREATE TABLE task (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombreTask TEXT," +
                "completedTask INTEGER," +
                "fecha_inicio TEXT," +
                "fecha_final TEXT," +
                "id_usuario INTEGER," +
                "FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)" +
                ")";
        db.execSQL(createTaskTableQuery);

        // Crea la tabla "cliente"
        String createClienteTableQuery = "CREATE TABLE cliente (" +
                "id_cliente INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre_cliente TEXT," +
                "apellido_cliente TEXT," +
                "edad_cliente INTEGER," +
                "telefono_cliente TEXT" +
                ")";
        db.execSQL(createClienteTableQuery);

        // Crea la tabla "health"
        String createHealthTableQuery = "CREATE TABLE health (" +
                "id_health INTEGER PRIMARY KEY AUTOINCREMENT," +
                "peso_health REAL," +
                "talla_health REAL," +
                "id_cliente INTEGER," +
                "FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)" +
                ")";
        db.execSQL(createHealthTableQuery);

        // Crea la tabla "usuario"
        String createUsuarioTableQuery = "CREATE TABLE usuario (" +
                "id_usuario INTEGER PRIMARY KEY AUTOINCREMENT," +
                "user_name TEXT," +
                "user_password TEXT," +
                "id_cliente INTEGER," +
                "FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)" +
                ")";
        db.execSQL(createUsuarioTableQuery);
        Log.d("DatabaseHelper","base de datos creada correctamente");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
