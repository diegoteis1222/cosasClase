// Sin refactorizar
class Enemigo {
    String tipoArmadura;
    float v = 100; // vida del enemigo
    float golpeBase = 40;
    private boolean muerto = false;

    enum TipoEnemigo {
        NORMAL, BOSS, FINAL_BOSS
    };

    TipoEnemigo tipoEnemigo;
    int durabilidadArmadura;
    int calidadArmadura;

    public float calculaPotenciaGolpe() {
        switch (tipoEnemigo) {
            case NORMAL:
                return golpeBase * v;
            case BOSS:
                return golpeBase * 8 * v;
            case FINAL_BOSS:
                return golpeBase * 20 * v;
            default:
                return 0;
        }
    }

    boolean estaMuerto() {
        if (muerto)
            return true;
        else
            return false;
    }
}

// Refactorizado
class Armadura {
    String tipoArmadura;
    int durabilidadArmadura;
    int calidadArmadura;
}

abstract class Enemigo {
    float vida = 100;
    float golpeBase = 40;
    Armadura armadura = new Armadura();

    boolean estaMuerto() {
        return vida <= 0;
    }

    abstract float calculapotenciagolpe();
}

class EnemigoNormal extends Enemigo {
    float calculaPotenciaGolpe() {
        return golpeBase * vida;
    }
}

class EnemigoBoss extends Enemigo {
    float calculaPotenciaGolpe() {
        return golpeBase * 8 * vida;
    }
}

class EnemigoFinalBoss extends Enemigo {
    float calculaPotenciaGolpe() {
        return golpeBase * 20 * vida;
    }
}