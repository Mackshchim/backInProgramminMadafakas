package mackshchim.firstwebapp;

import mackshchim.firstwebapp.models.Cortege;

import java.util.HashMap;
import java.util.Set;

public class KindaDatabase {
    private HashMap<String,HashMap> tables;

    public KindaDatabase() {
        tables = new HashMap<>();
    }

    public void createNewTable(String name) {
        tables.put(name, new HashMap<>());
    }

    public Set<String> getSetOfTableNames() {
        return tables.keySet();
    }

    public boolean putCortegeInTable(Cortege cortege, String tableName) {
            try {
                HashMap cur = tables.get(tableName);
                cur.put(cortege.getId(), cortege);
                tables.put(tableName, cur);
                return true;
            } catch (Exception e) {
                return false;
            }
    }

    public boolean has(String tableName) {
        return tables.containsKey(tableName);
    }

    public boolean tableHas(String tableName, Object id) {
        try {
            HashMap table = tables.get(tableName);
            return table.containsKey(id);
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }

    }

    public Cortege getCortegeFromTable(Object id, String tableName) {
        try {
            HashMap cur = tables.get(tableName);
            return (Cortege) cur.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean dropTable(String tableName) {
        try {
            tables.remove(tableName);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void dropAllTable() {
        tables = new HashMap<>();
    }

    public HashMap getTable(String tableName) {
        return tables.get(tableName);
    }
}
