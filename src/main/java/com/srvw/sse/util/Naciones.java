package com.srvw.sse.util;

import java.util.HashMap;
import java.util.Map;


public class Naciones
{
    public static final int ESPANA = 108;
    public static final int GIPUZKOA = 20;
    
    private static final Map<Integer,String> mapProvinciasEsp;

    private static final Map<Integer,String> mapRegiones;
    private static final Map<Integer,String> mapEuropa;
    private static final Map<Integer,String> mapAfrica;
    private static final Map<Integer,String> mapAmerica;
    private static final Map<Integer,String> mapAsia;
    private static final Map<Integer,String> mapOceania;

    static
    {

        mapRegiones = new HashMap<Integer,String>();
        
        mapRegiones.put(1,"Europa");
        mapRegiones.put(2,"Africa");
        mapRegiones.put(3,"América");
        mapRegiones.put(4,"Asia");
        mapRegiones.put(5,"Oceanía");

        mapProvinciasEsp = new HashMap<Integer,String>();

        mapProvinciasEsp.put(2,"Albacete");
        mapProvinciasEsp.put(3,"Alicante/Alacant");
        mapProvinciasEsp.put(4,"Almería");
        mapProvinciasEsp.put(1,"Araba/Álava");
        mapProvinciasEsp.put(33,"Asturias");
        mapProvinciasEsp.put(5,"Ávila");
        mapProvinciasEsp.put(6,"Badajoz");
        mapProvinciasEsp.put(7,"Islas Baleares");
        mapProvinciasEsp.put(8,"Barcelona");
        mapProvinciasEsp.put(48,"Bizkaia");
        mapProvinciasEsp.put(9,"Burgos");
        mapProvinciasEsp.put(10,"Cáceres");
        mapProvinciasEsp.put(11,"Cádiz");
        mapProvinciasEsp.put(39,"Cantabria");
        mapProvinciasEsp.put(12,"Castellón/Castelló");
        mapProvinciasEsp.put(13,"Ciudad Real");
        mapProvinciasEsp.put(14,"Córdoba");
        mapProvinciasEsp.put(15,"La Coruña");
        mapProvinciasEsp.put(16,"Cuenca");
        mapProvinciasEsp.put(20,"Gipuzkoa");
        mapProvinciasEsp.put(17,"Girona");
        mapProvinciasEsp.put(18,"Granada");
        mapProvinciasEsp.put(19,"Guadalajara");
        mapProvinciasEsp.put(21,"Huelva");
        mapProvinciasEsp.put(22,"Huesca");
        mapProvinciasEsp.put(23,"Jaén");
        mapProvinciasEsp.put(24,"León");
        mapProvinciasEsp.put(25,"Lleida");
        mapProvinciasEsp.put(27,"Lugo");
        mapProvinciasEsp.put(28,"Madrid");
        mapProvinciasEsp.put(29,"Málaga");
        mapProvinciasEsp.put(30,"Murcia");
        mapProvinciasEsp.put(31,"Navarra");
        mapProvinciasEsp.put(32,"Ourense");
        mapProvinciasEsp.put(34,"Palencia");
        mapProvinciasEsp.put(35,"Las Palmas");
        mapProvinciasEsp.put(36,"Pontevedra");
        mapProvinciasEsp.put(26,"La Rioja");
        mapProvinciasEsp.put(37,"Salamanca");
        mapProvinciasEsp.put(38,"Santa Cruz de Tenerife");
        mapProvinciasEsp.put(40,"Segovia");
        mapProvinciasEsp.put(41,"Sevilla");
        mapProvinciasEsp.put(42,"Soria");
        mapProvinciasEsp.put(43,"Tarragona");
        mapProvinciasEsp.put(44,"Teruel");
        mapProvinciasEsp.put(45,"Toledo");
        mapProvinciasEsp.put(46,"Valencia/València");
        mapProvinciasEsp.put(47,"Valladolid");
        mapProvinciasEsp.put(49,"Zamora");
        mapProvinciasEsp.put(50,"Zaragoza");
        mapProvinciasEsp.put(51,"Ceuta");
        mapProvinciasEsp.put(52,"Melilla");
    }

    static
    {
        mapEuropa = new HashMap<Integer,String>();

        mapEuropa.put(102,"Austria");
        mapEuropa.put(103,"Bélgica");
        mapEuropa.put(104,"Bulgaria");
        mapEuropa.put(106,"Chipre");
        mapEuropa.put(107,"Dinamarca");
        mapEuropa.put(108,"España");
        mapEuropa.put(109,"Finlandia");
        mapEuropa.put(110,"Francia");
        mapEuropa.put(111,"Grecia");
        mapEuropa.put(112,"Hungría");
        mapEuropa.put(113,"Irlanda");
        mapEuropa.put(115,"Italia");
        mapEuropa.put(117,"Luxemburgo");
        mapEuropa.put(118,"Malta");
        mapEuropa.put(121,"Países Bajos");
        mapEuropa.put(122,"Polonia");
        mapEuropa.put(123,"Portugal");
        mapEuropa.put(125,"Reino Unido");
        mapEuropa.put(126,"Alemania");
        mapEuropa.put(128,"Rumanía");
        mapEuropa.put(131,"Suecia");
        mapEuropa.put(136,"Letonia");
        mapEuropa.put(141,"Estonia");
        mapEuropa.put(142,"Lituania");
        mapEuropa.put(143,"República Checa");
        mapEuropa.put(144,"República Eslovaca");
        mapEuropa.put(146,"Croacia");
        mapEuropa.put(147,"Eslovenia");
        mapEuropa.put(101,"Albania");
        mapEuropa.put(114,"Islandia");
        mapEuropa.put(116,"Liechtenstein");
        mapEuropa.put(119,"Mónaco");
        mapEuropa.put(120,"Noruega");
        mapEuropa.put(124,"Andorra");
        mapEuropa.put(129,"San Marino");
        mapEuropa.put(130,"Santa Sede");
        mapEuropa.put(132,"Suiza");
        mapEuropa.put(135,"Ucrania");
        mapEuropa.put(137,"Moldavia");
        mapEuropa.put(138,"Belarús");
        mapEuropa.put(139,"Georgia");
        mapEuropa.put(145,"Bosnia y Herzegovina");
        mapEuropa.put(148,"Armenia");
        mapEuropa.put(154,"Rusia");
        mapEuropa.put(156,"Macedonia");
        mapEuropa.put(157,"Serbia");
        mapEuropa.put(158,"Montenegro");
        mapEuropa.put(199,"Otros países de Europa");

        mapAfrica = new HashMap<Integer,String>();

        mapAfrica.put(201,"Burkina Faso");
        mapAfrica.put(202,"Angola");
        mapAfrica.put(203,"Argelia");
        mapAfrica.put(204,"Benin");
        mapAfrica.put(205,"Botswana");
        mapAfrica.put(206,"Burundi");
        mapAfrica.put(207,"Cabo Verde");
        mapAfrica.put(208,"Camerún");
        mapAfrica.put(209,"Comores");
        mapAfrica.put(210,"Congo");
        mapAfrica.put(211,"Costa de Marfil");
        mapAfrica.put(212,"Djibouti");
        mapAfrica.put(213,"Egipto");
        mapAfrica.put(214,"Etiopía");
        mapAfrica.put(215,"Gabón");
        mapAfrica.put(216,"Gambia");
        mapAfrica.put(217,"Ghana");
        mapAfrica.put(218,"Guinea");
        mapAfrica.put(219,"Guinea-Bissau");
        mapAfrica.put(220,"Guinea Ecuatorial");
        mapAfrica.put(221,"Kenia");
        mapAfrica.put(222,"Lesotho");
        mapAfrica.put(223,"Liberia");
        mapAfrica.put(224,"Libia");
        mapAfrica.put(225,"Madagascar");
        mapAfrica.put(226,"Malawi");
        mapAfrica.put(227,"Mali");
        mapAfrica.put(228,"Marruecos");
        mapAfrica.put(229,"Mauricio");
        mapAfrica.put(230,"Mauritania");
        mapAfrica.put(231,"Mozambique");
        mapAfrica.put(232,"Namibia");
        mapAfrica.put(233,"Níger");
        mapAfrica.put(234,"Nigeria");
        mapAfrica.put(235,"República Centroafricana");
        mapAfrica.put(236,"Sudáfrica");
        mapAfrica.put(237,"Ruanda");
        mapAfrica.put(238,"Santo Tomé y Príncipe");
        mapAfrica.put(239,"Senegal");
        mapAfrica.put(240,"Seychelles");
        mapAfrica.put(241,"Sierra Leona");
        mapAfrica.put(242,"Somalia");
        mapAfrica.put(243,"Sudán");
        mapAfrica.put(244,"Swazilandia");
        mapAfrica.put(245,"Tanzania");
        mapAfrica.put(246,"Chad");
        mapAfrica.put(247,"Togo");
        mapAfrica.put(248,"Túnez");
        mapAfrica.put(249,"Uganda");
        mapAfrica.put(250,"República Democrática del Congo");
        mapAfrica.put(251,"Zambia");
        mapAfrica.put(252,"Zimbabwe");
        mapAfrica.put(253,"Eritrea");
        mapAfrica.put(254,"Sudán del Sur");
        mapAfrica.put(299,"Otros países de África");

        mapAmerica = new HashMap<Integer,String>();

        mapAmerica.put(301,"Canadá");
        mapAmerica.put(302,"Estados Unidos de América");
        mapAmerica.put(303,"México");
        mapAmerica.put(310,"Antigua y Barbuda");
        mapAmerica.put(311,"Bahamas");
        mapAmerica.put(312,"Barbados");
        mapAmerica.put(313,"Belice");
        mapAmerica.put(314,"Costa Rica");
        mapAmerica.put(315,"Cuba");
        mapAmerica.put(316,"Dominica");
        mapAmerica.put(317,"El Salvador");
        mapAmerica.put(318,"Granada");
        mapAmerica.put(319,"Guatemala");
        mapAmerica.put(320,"Haití");
        mapAmerica.put(321,"Honduras");
        mapAmerica.put(322,"Jamaica");
        mapAmerica.put(323,"Nicaragua");
        mapAmerica.put(324,"Panamá");
        mapAmerica.put(325,"San Vicente y las Granadinas");
        mapAmerica.put(326,"República Dominicana");
        mapAmerica.put(327,"Trinidad y Tobago");
        mapAmerica.put(328,"Santa Lucía");
        mapAmerica.put(329,"San Cristóbal y Nieves");
        mapAmerica.put(340,"Argentina");
        mapAmerica.put(341,"Bolivia");
        mapAmerica.put(342,"Brasil");
        mapAmerica.put(343,"Colombia");
        mapAmerica.put(344,"Chile");
        mapAmerica.put(345,"Ecuador");
        mapAmerica.put(346,"Guyana");
        mapAmerica.put(347,"Paraguay");
        mapAmerica.put(348,"Perú");
        mapAmerica.put(349,"Surinam");
        mapAmerica.put(350,"Uruguay");
        mapAmerica.put(351,"Venezuela");
        mapAmerica.put(399,"Otros países de América");

        mapAsia = new HashMap<Integer,String>();

        mapAsia.put(401,"Afganistán");
        mapAsia.put(402,"Arabia Saudí");
        mapAsia.put(403,"Bahréin");
        mapAsia.put(404,"Bangladesh");
        mapAsia.put(405,"Myanmar");
        mapAsia.put(407,"China");
        mapAsia.put(408,"Emiratos Árabes Unidos");
        mapAsia.put(409,"Filipinas");
        mapAsia.put(410,"India");
        mapAsia.put(411,"Indonesia");
        mapAsia.put(412,"Iraq");
        mapAsia.put(413,"Irán");
        mapAsia.put(414,"Israel");
        mapAsia.put(415,"Japón");
        mapAsia.put(416,"Jordania");
        mapAsia.put(417,"Camboya");
        mapAsia.put(418,"Kuwait");
        mapAsia.put(419,"Laos");
        mapAsia.put(420,"Líbano");
        mapAsia.put(421,"Malasia");
        mapAsia.put(422,"Maldivas");
        mapAsia.put(423,"Mongolia");
        mapAsia.put(424,"Nepal");
        mapAsia.put(425,"Omán");
        mapAsia.put(426,"Pakistán");
        mapAsia.put(427,"Qatar");
        mapAsia.put(430,"Corea");
        mapAsia.put(431,"Corea del Norte");
        mapAsia.put(432,"Singapur");
        mapAsia.put(433,"Siria");
        mapAsia.put(434,"Sri Lanka");
        mapAsia.put(435,"Tailandia");
        mapAsia.put(436,"Turquía");
        mapAsia.put(437,"Vietnam");
        mapAsia.put(439,"Brunei");
        mapAsia.put(440,"Islas Marshall");
        mapAsia.put(441,"Yemen");
        mapAsia.put(442,"Azerbaiyán");
        mapAsia.put(443,"Kazajstán");
        mapAsia.put(444,"Kirguistán");
        mapAsia.put(445,"Tayikistán");
        mapAsia.put(446,"Turkmenistán");
        mapAsia.put(447,"Uzbekistán");
        mapAsia.put(448,"Bhután");
        mapAsia.put(449,"Palestina - Estado Observador");
        mapAsia.put(499,"Otros países de Asia");

        mapOceania = new HashMap<Integer,String>();

        mapOceania.put(501,"Australia");
        mapOceania.put(502,"Fiji");
        mapOceania.put(504,"Nueva Zelanda");
        mapOceania.put(505,"Papúa Nueva Guinea");
        mapOceania.put(506,"Islas Salomón");
        mapOceania.put(507,"Samoa");
        mapOceania.put(508,"Tonga");
        mapOceania.put(509,"Vanuatu");
        mapOceania.put(511,"Micronesia");
        mapOceania.put(512,"Tuvalu");
        mapOceania.put(513,"Islas Cook");
        mapOceania.put(514,"Kiribati");
        mapOceania.put(515,"Nauru");
        mapOceania.put(516,"Palaos");
        mapOceania.put(517,"Timor Oriental");
        mapOceania.put(599,"Otros países de Oceanía");
    }
    


    
    public static final String getJSONRegiones()
    {
        return Json.map2JsonLookUpLst(mapRegiones);
    }
    
    public static final String getJSONProvinciasEsp()
    {
        return Json.map2JsonLookUpLst(mapProvinciasEsp);
    }
    
    public static final String getJSONPaisesEuropa()
    {
        return Json.map2JsonLookUpLst(mapEuropa);
    }
    
    public static final String getJSONPaisesAfrica()
    {
        return Json.map2JsonLookUpLst(mapAfrica);
    }
    public static final String getJSONPaisesAmerica()
    {
        return Json.map2JsonLookUpLst(mapAmerica);
    }
    public static final String getJSONPaisesAsia()
    {
        return Json.map2JsonLookUpLst(mapAsia);
    }
    public static final String getJSONPaisesOceania()
    {
        return Json.map2JsonLookUpLst(mapOceania);
    }
    
//    public static void main(String[] args)
//    {
//        System.out.println( Naciones.getJSONRegiones());
//        
//        System.out.println( Naciones.getJSONPaisesAmerica());
//        
//        System.out.println( Naciones.getJSONProvinciasEsp() );
//               
//    }
}
