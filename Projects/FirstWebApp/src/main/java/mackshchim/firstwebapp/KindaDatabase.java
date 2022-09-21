package mackshchim.firstwebapp;

import mackshchim.firstwebapp.models.Cortege;

import java.util.HashMap;
import java.util.Set;

public class KindaDatabase {
    private HashMap<Object,HashMap> tables;

    public KindaDatabase() {
        tables = new HashMap<>();
    }

    public void createNewTable(String name) {
        tables.put(name, new HashMap<>());
    }

    public Set<Object> getSetOfTableNames() {
        return tables.keySet();
    }

    public boolean putCortegeInTable(Cortege cortege, String tableName) {
            try {
                HashMap cur = tables.get("tableName");
                cur.put(cortege.getId(), cortege);
                tables.put(tableName, cur);
                return true;
            } catch (Exception e) {
                return false;
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
}
