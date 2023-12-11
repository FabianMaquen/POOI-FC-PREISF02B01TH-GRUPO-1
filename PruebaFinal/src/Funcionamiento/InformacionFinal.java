/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionamiento;


public class InformacionFinal {
    //Ingreso de las respuestas de las hojas finales a(1-8)u(1-2)
    String au, ad, bu, bd, cu, cd, du, dd, eu, ed, fu, fd ,gu ,gd;
    public InformacionFinal() {
    }
    public InformacionFinal(String au, String ad, String bu, String bd, String cu, String cd, String du, String dd,
            String eu, String ed, String fu, String fd, String gu, String gd) {
        this.au = au;
        this.ad = ad;
        this.bu = bu;
        this.bd = bd;
        this.cu = cu;
        this.cd = cd;
        this.du = du;
        this.dd = dd;
        this.eu = eu;
        this.ed = ed;
        this.fu = fu;
        this.fd = fd;
        this.gu = gu;
        this.gd = gd;
    }
    public String getAu() {
        return "  Lista de Becas Disponibles!!\n"+
                "\n      > Beca Económica Social \n" + //
                "      > Beca Orfandad \n" + //
                "      > Beca Inclusión \n" + //
                "      > Beca Deportes \n" + //
                "      > Beca Excelencia Académica \n"+
                "   ¡!Para postular a accede a nuestro portal web!!";
    }
    public String getAd() {
        return "  Estos son los requisitos!! \n"+
                "\n      > Documentos para la inscripción\n" + //
                "      > Ficha de datos personales llenada online.\n" + //
                "      > Certificado oficial de notas de los cinco años de estudios\n         secundarios visado por UGEL (física o virtual) o\n         constancia de logro de aprendizaje.\n" + //
                "      > Si no cuentas con alguno de estos documentos,  \n          completa este compromiso de documentos pendientes.\n" + //
                "      > Copia simple del DNI.\n" + //
                "      > Foto (formato jpg en fondo blanco) solo para menores\n          de edad.  ";
    }
    public String getBu() {
        return "  Sigue estos pasos!! \n\n"+
                "      > Identifica los Clubes\n" + //
                "      > Consulta el INFOSIL\n" + //
                "      > Accede al INFOSIL\n" + //
                "      > Selecciona el Club de tu Elección\n" + //
                "      > Completa el Proceso de Inscripción";
    }
    public String getBd() {
        return "  Lista de eventos:  \n\n      > Hablemos de TCA 30/11/2023 - 5:00 p.m\n      > Taller global 2.0 27/11/23\n      > Sorteo de Libros 30//11/23\n      > Feria de carreras 10/12/23 1:00 p.m";
    }
    public String getCu() {
        return  "  A CHAMBEAR !!!\n\n"+
                "\n      > CC GROUP PERU\n\n"+
                "         PRACTICANTE INGENIERÍA DE SISTEMAS - D. WEB\n"+
                "         Inicio : 23/11/2023 - Fin: 08/12/2023\n" + 
                "\n      > PROYECTA INGENIEROS\n\n"+
                "         Practicante contable\n"+
                "         Inicio : 22/11/2023 - Fin: 20/12/2023\n" + 
                "\n      > SODIMAC\n\n "+
                "         PRACTICANTE DE ATRACCIÓN AL TALENTO\n"+
                "         Inicio : 20/11/2023 - Fin: 08/12/2023\n" + 
                "\n      > INCHCAPE PERÚ\n\n"+
                "         PRACTICANTE PRE PROFESIONAL DE DISEÑO GRÁFICO \n"+
                "         Inicio : 20/11/2023 - Fin : 08/12/2023\n" + 
                "\n      > FE Y ALEGRIA DEL PERU\n\n"+
                "         PRACTICANTE\n"+
                "         Inicio : 20/11/2023 - Fin : 30/11/2023\n" + //
                "\n      > COOP. SERVICIOS EDUCACIONALES ABRAHAM LINCOLN\n\n "+
                "         PRACTICANTE PRE PROFESIONAL DE SISTEMAS\n"+
                "         Inicio : 17/11/2023 - Fin : 07/12/2023\n" + //
                "\n      > FUNDACIÓN CALMA\n\n"+
                "         PRACTICANTE EN DISEÑO GRÁFICO-MARKETING Y\n         COMUNICACIONES\n"+
                "         Inicio : 17/11/2023 - Fin : 08/12/2023\n" + //
                "\n      > DISEÑOS LUCHO\n\n"+
                "         DISEÑADOR GRÁFICO TEXTIL\n"+
                "         Inicio 17/11/2023 - Fin : 08/12/2023\n" + //
                "\n      > LATAM AIRLINES\n\n"+
                "         PRACTICANTE DE COMUNICACIÓN INTERNA\n "+
                "         Inicio : 17/11/2023 - Fin: 08/12/2023\n" + //
                "\n      > ARQUISALUD\n\n"+
                "         PRACTICANTE DE ARQUITECTURA\n"+
                "         Inicio : 16/11/2023 - Fin : 07/12/2023";
    }
    
    public String getCd() {
        return "  Elaborar un currículum vitae (CV) es un paso importante en\n         la búsqueda de empleo. Aquí te proporciono una guía general sobre\n         qué incluir al elaborar un currículum:\n\n" + //
                "      > Información de contacto\n" + //
                "      > Perfil o Resumen Personal\n" + //
                "      > Experiencia Laboral\n" + //
                "      > Educación\n" + //
                "      > Habilidades\n" + //
                "      > Logros y Reconocimientos\n" + //
                "      > Actividades y Afiliaciones\n" + //
                "      > Idiomas\n" + //
                "      > Referencias\n" + //
                "     Si deseas más información sobre este tema puedes acceder\n     a las charlas de este tema organizadas por la universidad.";
    }
    public String getDu() {
        return " Horario de atención:\n\n      > Lunes a viernes, de 8 a.m. a 8 p.m.\n      > sábado, de 8 am. a 5 p.m.";
    }
    public String getDd() {
        return "  Para separar una cita en atención al alumno es necesario\n\t que usted se comunique con la usil mediante sus\n\t canales de atención, los cuales los puede encontrar en \n\t esta misma plataforma.";
    }
    public String getEu() {
        return "  El programa de intercambio académico te brinda la\n\tposibilidad de estudiar en una universidad partner \n\t  en cualquier parte del mundo mientras continúas\n\t pagando lo mismo en USIL (matrícula + cuotas USIL).\n\t Puedes llevar estudiar en la universidad socia por uno o\n\t dos periodos académicos y avanzar tu carrera\n\t convalidando cursos de tu plan de estudios.\n\n" + //
                "    > Beneficios:\n\n" + //
                "    * Incrementar tu red de contactos internacionales.\n" + //
                "    * Aprender y fortalecer el conocimiento de idiomas.\n" + //
                "    * Conocer estudiantes de otras nacionalidades y adquirir\n         habilidades interculturales.\n" + //
                "    * Podrás convalidar cursos de tu plan de estudios USIL y así\n          avanzar con tu carrera\n" + //
                "    * Pagas tu matrícula y cinco cuotas USIL, estudiando en el\n          extranjero.\n" + //
                "    * Internacionaliza tu CV profesional.";
    }
    public String getEd() {
        return "   Contamos con más de 270 convenios internacionales a\n\tlos cuales puedes acceder para realizar intercambios\n\testudiantiles.\n" +
                "     \n> Algunas de las universidades con las que la USIL\n          tiene convenio son:\n \n" + //
                "    * Universidad de Sevilla (España)\n" + //
                "    * London Metropolitan University (Reino Unido),\n    * Linnaeus University (Suecia)\n" + //
                "    * Hogent - University of Applied Sciences and Arts (Holanda)\n" + //
                "    * Domus Academy\n    *  Universita Di Parma\n    * Universidad di Pisa (Italia).\n" + //
                "    !Estas son solo algunas de las opciones !";
    }
    public String getFu() {
        return "   Para obtener tu carné universitario en el ciclo 2023-2\n\t sigue este proceso:\n" + //
                "   * Fecha de solicitudes: Del viernes 7 al viernes 14 de octubre.\n" + //
                "   * Fecha límite de pago: Máximo dos (02) días después de generar el\n\tconcepto de pago.\n" + //
                "   * Fecha de entrega estimada: En 30 días hábiles (El tiempo\n\tde entrega dependerá de la cantidad de solicitudes).\n" + //
                "\n      >  Requisitos:\n\n" + //
                "   * Debes estar matriculado en el ciclo 2023-2\n" + //
                "   * Asegúrate de tener una foto almacenada en el sistema.\n" + //
                "   * La foto debe cumplir con los requisitos mínimos establecidos.\n" + //
                "   * Haber realizado el pago de S/.11.50";
    }
    public String getFd() {
        return "      PARA RETIROS :\n      > ¿Cuáles son los requisitos para solicitarlo?\n" + //
                "       Debes haber estado matriculado en un periodo académico vigente.\n\n" +
                "      > ¿Cómo lo solicito?\n" + 
                "       Para solicitarlo debes ingresar a la siguiente ruta en\n       INFOSIL: TRÁMITES / ACADÉMICOS / RETIRO DE PERIODO.\n\n" +
                "      > ¿En qué momento puedo solicitarlo?\n" + 
                "       De forma virtual, a través de su INFOSIL, dentro del plazo\n       establecido en el Calendario Académico.\n\n" +
                "      > ¿Cuánto cuesta?\n" + 
                "       El costo es de S/ 200.";
    }
    public String getGu() {
        return "   Los pagos se podrán efectuar únicamente en las siguientes\n\t entidades bancarias:\n\n      > Banco de Crédito\n      > Scotiabank\n      > BBVA Continental\n     ¡SON LOS ENTES DE COBRANZA EN LINEA! \n";
    }
    public String getGd() {
        return  " Periodo 2023-2\n" +
                    "     * Pago de matrícula y primera cuota: Del 22 al 31 de julio.\n" +
                    "     * Pago de la segunda cuota: Del 24 al 31 de agosto.\n" + 
                    "     * Pago de la tercera cuota: Del 21 al 30 de septiembre.\n" + 
                    "     * Pago de la cuarta cuota: Del 20 al 31 de octubre.\n" + 
                    "     * Pago de la quinta cuota: Del 21 al 30 de noviembre.\n" +
                    "     * Pago para la solicitud del examen final rezagado,\n        tramitado y aprobado: 5 de diciembre \n        (fecha límite)";
            
    }
}
