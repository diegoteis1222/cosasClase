import psycopg2

conn = psycopg2.connect(
    host = "localhost",
    user = "postgres",
    password = "renaido",
    port = "5432",
    dbname = "escueladb"
)

cursor = conn.cursor()
cursor.execute('SELECT * FROM estudiantes')
estudiantes = cursor.fetchall()
for estudiante in estudiantes:
    print(estudiante)

cursor.close()
conn.close()