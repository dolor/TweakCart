package com.tweakcart.model;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

/**
 * Created by IntelliJ IDEA.
 *
 * @author TheSec, Edoxile
 */
public class IntMap {
    private static final int materialSize = Material.values().length - 1;
    private int[] mapData;

    public IntMap() {
        mapData = new int[537];
    }

    private IntMap(int[] data) {
        if (data.length != 538) {
            mapData = new int[537];
        } else {
            mapData = data;
        }
    }

    public static boolean allowed(int id, byte data) {
        int byteLocation = IntMap.getByteIndex(id, data);
        return byteLocation != -1;
    }

    public int amount(int id, byte data) {
        int byteLocation = IntMap.getByteIndex(id, data);

        if (byteLocation == -1) {
            return 0;
        }

        return mapData[byteLocation];
    }

    public boolean setByte(int id, byte data) {
        return setByte(id, data, Integer.MAX_VALUE);
    }

    public boolean setByte(int id, byte data, int value) {
        int byteLocation = IntMap.getByteIndex(id, data);
        if (byteLocation == -1) {
            return false;
        }
        mapData[byteLocation] = value;
        return true;
    }

    private static int getIntIndex(int id, byte data) {
        return getIntIndex(new MaterialData(id, data).getItemType(), data);
    }

    private static int getIntIndex(Material m, byte data) {
        switch (data) {
            case 0:
                //Alle items waarop we .ordinal kunnen doen
                return m.ordinal();
            default:
                //Alle andere gevallen
                switch (m) {
                    case SAPLING:
                        return materialSize + (int)data;
                    case LOG:
                        return materialSize + (int)data + 2;
                    case LEAVES:
                        return materialSize + (int)data + 4;
                    case WOOL:
                        return materialSize + (int)data + 18;
                    case INK_SACK:
                        return materialSize + (int)data + 32;
                    default:
                        return m.ordinal();
                }
        }
    }

    @Deprecated
    private static int getByteIndex(int id, byte data) {
        switch (id) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                switch (data) {
                    case 0:
                        return 6;
                    case 1:
                        return 7;
                    case 2:
                        return 8;
                    default:
                        return 5;
                }
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                switch (data) {
                    case 0:
                        return 20;
                    case 1:
                        return 21;
                    case 2:
                        return 22;
                    default:
                        return 19;
                }
            case 18:
                return 23;
            case 19:
                return 24;
            case 20:
                return 25;
            case 21:
                return 26;
            case 22:
                return 27;
            case 23:
                return 28;
            case 24:
                return 29;
            case 25:
                return 30;
            case 26:
                return 31;
            case 27:
                return 32;
            case 28:
                return 33;
            case 29:
                return 34;
            case 30:
                return 35;
            case 31:
                return 36;
            case 32:
                return 37;
            case 33:
                return 38;
            case 34:
                return 39;
            case 35:
                switch (data) {
                    case 0:
                        return 41;
                    case 1:
                        return 42;
                    case 2:
                        return 43;
                    case 3:
                        return 44;
                    case 4:
                        return 45;
                    case 5:
                        return 46;
                    case 6:
                        return 47;
                    case 7:
                        return 48;
                    case 8:
                        return 49;
                    case 9:
                        return 50;
                    case 10:
                        return 51;
                    case 11:
                        return 52;
                    case 12:
                        return 53;
                    case 13:
                        return 54;
                    case 14:
                        return 55;
                    case 15:
                        return 56;
                    default:
                        return 40;
                }
            case 36:
                return 57;
            case 37:
                return 58;
            case 38:
                return 59;
            case 39:
                return 60;
            case 40:
                return 61;
            case 41:
                return 62;
            case 42:
                return 63;
            case 43:
                switch (data) {
                    case 0:
                        return 65;
                    case 1:
                        return 66;
                    case 2:
                        return 67;
                    case 3:
                        return 68;
                    default:
                        return 64;
                }
            case 44:
                switch (data) {
                    case 0:
                        return 70;
                    case 1:
                        return 70;
                    case 2:
                        return 72;
                    case 3:
                        return 73;
                    default:
                        return 69;
                }
            case 45:
                return 74;
            case 46:
                return 75;
            case 47:
                return 76;
            case 48:
                return 77;
            case 49:
                return 78;
            case 50:
                return 79;
            case 51:
                return 80;
            case 52:
                return 81;
            case 53:
                return 82;
            case 54:
                return 83;
            case 55:
                return 84;
            case 56:
                return 85;
            case 57:
                return 86;
            case 58:
                return 87;
            case 59:
                return 88;
            case 60:
                return 89;
            case 61:
                return 90;
            case 62:
                return 91;
            case 63:
                return 92;
            case 64:
                return 93;
            case 65:
                return 94;
            case 66:
                return 95;
            case 67:
                return 96;
            case 68:
                return 97;
            case 69:
                return 98;
            case 70:
                return 99;
            case 71:
                return 100;
            case 72:
                return 101;
            case 73:
                return 102;
            case 74:
                return 103;
            case 75:
                return 104;
            case 76:
                return 105;
            case 77:
                return 106;
            case 78:
                return 107;
            case 79:
                return 108;
            case 80:
                return 109;
            case 81:
                return 110;
            case 82:
                return 111;
            case 83:
                return 112;
            case 84:
                return 113;
            case 85:
                return 114;
            case 86:
                return 115;
            case 87:
                return 116;
            case 88:
                return 117;
            case 89:
                return 118;
            case 90:
                return 119;
            case 91:
                return 120;
            case 92:
                return 121;
            case 93:
                return 122;
            case 94:
                return 123;
            case 95:
                return 124;
            case 96:
                return 125;
            case 97:
                return 126;
            case 98:
                return 127;
            case 99:
                return 128;
            case 100:
                return 129;
            case 101:
                return 130;
            case 102:
                return 131;
            case 103:
                return 132;
            case 104:
                return 133;
            case 105:
                return 134;
            case 106:
                return 135;
            case 107:
                return 136;
            case 108:
                return 137;
            case 109:
                return 138;
            case 110:
                return 139;
            case 111:
                return 140;
            case 112:
                return 141;
            case 113:
                return 142;
            case 114:
                return 143;
            case 115:
                return 144;
            case 116:
                return 145;
            case 117:
                return 146;
            case 118:
                return 147;
            case 119:
                return 148;
            case 120:
                return 149;
            case 121:
                return 150;
            case 122:
                return 151;
            case 123:
                return 152;
            case 124:
                return 153;
            case 125:
                return 154;
            case 126:
                return 155;
            case 127:
                return 156;
            case 128:
                return 157;
            case 129:
                return 158;
            case 130:
                return 159;
            case 131:
                return 160;
            case 132:
                return 161;
            case 133:
                return 162;
            case 134:
                return 163;
            case 135:
                return 164;
            case 136:
                return 165;
            case 137:
                return 166;
            case 138:
                return 167;
            case 139:
                return 168;
            case 140:
                return 169;
            case 141:
                return 170;
            case 142:
                return 171;
            case 143:
                return 172;
            case 144:
                return 173;
            case 145:
                return 174;
            case 146:
                return 175;
            case 147:
                return 176;
            case 148:
                return 177;
            case 149:
                return 178;
            case 150:
                return 179;
            case 151:
                return 180;
            case 152:
                return 181;
            case 153:
                return 182;
            case 154:
                return 183;
            case 155:
                return 184;
            case 156:
                return 185;
            case 157:
                return 186;
            case 158:
                return 187;
            case 159:
                return 188;
            case 160:
                return 189;
            case 161:
                return 190;
            case 162:
                return 191;
            case 163:
                return 192;
            case 164:
                return 193;
            case 165:
                return 194;
            case 166:
                return 195;
            case 167:
                return 196;
            case 168:
                return 197;
            case 169:
                return 198;
            case 170:
                return 199;
            case 171:
                return 200;
            case 172:
                return 201;
            case 173:
                return 202;
            case 174:
                return 203;
            case 175:
                return 204;
            case 176:
                return 205;
            case 177:
                return 206;
            case 178:
                return 207;
            case 179:
                return 208;
            case 180:
                return 209;
            case 181:
                return 210;
            case 182:
                return 211;
            case 183:
                return 212;
            case 184:
                return 213;
            case 185:
                return 214;
            case 186:
                return 215;
            case 187:
                return 216;
            case 188:
                return 217;
            case 189:
                return 218;
            case 190:
                return 219;
            case 191:
                return 220;
            case 192:
                return 221;
            case 193:
                return 222;
            case 194:
                return 223;
            case 195:
                return 224;
            case 196:
                return 225;
            case 197:
                return 226;
            case 198:
                return 227;
            case 199:
                return 228;
            case 200:
                return 229;
            case 201:
                return 230;
            case 202:
                return 231;
            case 203:
                return 232;
            case 204:
                return 233;
            case 205:
                return 234;
            case 206:
                return 235;
            case 207:
                return 236;
            case 208:
                return 237;
            case 209:
                return 238;
            case 210:
                return 239;
            case 211:
                return 240;
            case 212:
                return 241;
            case 213:
                return 242;
            case 214:
                return 243;
            case 215:
                return 244;
            case 216:
                return 245;
            case 217:
                return 246;
            case 218:
                return 247;
            case 219:
                return 248;
            case 220:
                return 249;
            case 221:
                return 250;
            case 222:
                return 251;
            case 223:
                return 252;
            case 224:
                return 253;
            case 225:
                return 254;
            case 226:
                return 255;
            case 227:
                return 256;
            case 228:
                return 257;
            case 229:
                return 258;
            case 230:
                return 259;
            case 231:
                return 260;
            case 232:
                return 261;
            case 233:
                return 262;
            case 234:
                return 263;
            case 235:
                return 264;
            case 236:
                return 265;
            case 237:
                return 266;
            case 238:
                return 267;
            case 239:
                return 268;
            case 240:
                return 269;
            case 241:
                return 270;
            case 242:
                return 271;
            case 243:
                return 272;
            case 244:
                return 273;
            case 245:
                return 274;
            case 246:
                return 275;
            case 247:
                return 276;
            case 248:
                return 277;
            case 249:
                return 278;
            case 250:
                return 279;
            case 251:
                return 280;
            case 252:
                return 281;
            case 253:
                return 282;
            case 254:
                return 283;
            case 255:
                return 284;
            case 256:
                return 285;
            case 257:
                return 286;
            case 258:
                return 287;
            case 259:
                return 288;
            case 260:
                return 289;
            case 261:
                return 290;
            case 262:
                return 291;
            case 263:
                switch (data) {
                    case 0:
                        return 293;
                    case 1:
                        return 294;
                    default:
                        return 292;
                }
            case 264:
                return 295;
            case 265:
                return 296;
            case 266:
                return 297;
            case 267:
                return 298;
            case 268:
                return 299;
            case 269:
                return 300;
            case 270:
                return 301;
            case 271:
                return 302;
            case 272:
                return 303;
            case 273:
                return 304;
            case 274:
                return 305;
            case 275:
                return 306;
            case 276:
                return 307;
            case 277:
                return 308;
            case 278:
                return 309;
            case 279:
                return 310;
            case 280:
                return 311;
            case 281:
                return 312;
            case 282:
                return 313;
            case 283:
                return 314;
            case 284:
                return 315;
            case 285:
                return 316;
            case 286:
                return 317;
            case 287:
                return 318;
            case 288:
                return 319;
            case 289:
                return 320;
            case 290:
                return 321;
            case 291:
                return 322;
            case 292:
                return 323;
            case 293:
                return 324;
            case 294:
                return 325;
            case 295:
                return 326;
            case 296:
                return 327;
            case 297:
                return 328;
            case 298:
                return 329;
            case 299:
                return 330;
            case 300:
                return 331;
            case 301:
                return 332;
            case 302:
                return 333;
            case 303:
                return 334;
            case 304:
                return 335;
            case 305:
                return 336;
            case 306:
                return 337;
            case 307:
                return 338;
            case 308:
                return 339;
            case 309:
                return 340;
            case 310:
                return 341;
            case 311:
                return 342;
            case 312:
                return 343;
            case 313:
                return 344;
            case 314:
                return 345;
            case 315:
                return 346;
            case 316:
                return 347;
            case 317:
                return 348;
            case 318:
                return 349;
            case 319:
                return 350;
            case 320:
                return 351;
            case 321:
                return 352;
            case 322:
                return 353;
            case 323:
                return 354;
            case 324:
                return 355;
            case 325:
                return 356;
            case 326:
                return 357;
            case 327:
                return 358;
            case 328:
                return 359;
            case 329:
                return 360;
            case 330:
                return 361;
            case 331:
                return 362;
            case 332:
                return 363;
            case 333:
                return 364;
            case 334:
                return 365;
            case 335:
                return 366;
            case 336:
                return 367;
            case 337:
                return 368;
            case 338:
                return 369;
            case 339:
                return 370;
            case 340:
                return 371;
            case 341:
                return 372;
            case 342:
                return 373;
            case 343:
                return 374;
            case 344:
                return 375;
            case 345:
                return 376;
            case 346:
                return 377;
            case 347:
                return 378;
            case 348:
                return 379;
            case 349:
                return 380;
            case 350:
                return 381;
            case 351:
                switch (data) {
                    case 0:
                        return 383;
                    case 1:
                        return 384;
                    case 2:
                        return 385;
                    case 3:
                        return 386;
                    case 4:
                        return 387;
                    case 5:
                        return 388;
                    case 6:
                        return 389;
                    case 7:
                        return 390;
                    case 8:
                        return 391;
                    case 9:
                        return 392;
                    case 10:
                        return 393;
                    case 11:
                        return 394;
                    case 12:
                        return 395;
                    case 13:
                        return 396;
                    case 14:
                        return 397;
                    case 15:
                        return 398;
                    default:
                        return 382;
                }
            case 352:
                return 399;
            case 353:
                return 400;
            case 354:
                return 401;
            case 355:
                return 402;
            case 356:
                return 403;
            case 357:
                return 404;
            case 358:
                return 405;
            case 359:
                return 406;
            case 360:
                return 407;
            case 361:
                return 408;
            case 362:
                return 409;
            case 363:
                return 410;
            case 364:
                return 411;
            case 365:
                return 412;
            case 366:
                return 413;
            case 367:
                return 414;
            case 368:
                return 415;
            case 369:
                return 416;
            case 370:
                return 417;
            case 371:
                return 418;
            case 372:
                return 419;
            case 373:
                return 420;
            case 374:
                return 421;
            case 375:
                return 422;
            case 376:
                return 423;
            case 377:
                return 424;
            case 378:
                return 425;
            case 379:
                return 426;
            case 380:
                return 427;
            case 381:
                return 428;
            case 382:
                return 429;
            case 383:
                return 430;
            case 384:
                return 431;
            case 385:
                return 432;
            case 386:
                return 433;
            case 387:
                return 434;
            case 388:
                return 435;
            case 389:
                return 436;
            case 390:
                return 437;
            case 391:
                return 438;
            case 392:
                return 439;
            case 393:
                return 440;
            case 394:
                return 441;
            case 395:
                return 442;
            case 396:
                return 443;
            case 397:
                return 444;
            case 398:
                return 445;
            case 399:
                return 446;
            case 400:
                return 447;
            case 401:
                return 448;
            case 402:
                return 449;
            case 403:
                return 450;
            case 404:
                return 451;
            case 405:
                return 452;
            case 406:
                return 453;
            case 407:
                return 454;
            case 408:
                return 455;
            case 409:
                return 456;
            case 410:
                return 457;
            case 411:
                return 458;
            case 412:
                return 459;
            case 413:
                return 460;
            case 414:
                return 461;
            case 415:
                return 462;
            case 416:
                return 463;
            case 417:
                return 464;
            case 418:
                return 465;
            case 419:
                return 466;
            case 420:
                return 467;
            case 421:
                return 468;
            case 422:
                return 469;
            case 423:
                return 470;
            case 424:
                return 471;
            case 425:
                return 472;
            case 426:
                return 473;
            case 427:
                return 474;
            case 428:
                return 475;
            case 429:
                return 476;
            case 430:
                return 477;
            case 431:
                return 478;
            case 432:
                return 479;
            case 433:
                return 480;
            case 434:
                return 481;
            case 435:
                return 482;
            case 436:
                return 483;
            case 437:
                return 484;
            case 438:
                return 485;
            case 439:
                return 486;
            case 440:
                return 487;
            case 441:
                return 488;
            case 442:
                return 489;
            case 443:
                return 490;
            case 444:
                return 491;
            case 445:
                return 492;
            case 446:
                return 493;
            case 447:
                return 494;
            case 448:
                return 495;
            case 449:
                return 496;
            case 450:
                return 497;
            case 451:
                return 498;
            case 452:
                return 499;
            case 453:
                return 500;
            case 454:
                return 501;
            case 455:
                return 502;
            case 456:
                return 503;
            case 457:
                return 504;
            case 458:
                return 505;
            case 459:
                return 506;
            case 460:
                return 507;
            case 461:
                return 508;
            case 462:
                return 509;
            case 463:
                return 510;
            case 464:
                return 511;
            case 465:
                return 512;
            case 466:
                return 513;
            case 467:
                return 514;
            case 468:
                return 515;
            case 469:
                return 516;
            case 470:
                return 517;
            case 471:
                return 518;
            case 472:
                return 519;
            case 473:
                return 520;
            case 474:
                return 521;
            case 475:
                return 522;
            case 476:
                return 523;
            case 477:
                return 524;
            case 478:
                return 525;
            case 479:
                return 526;
            case 480:
                return 527;
            case 481:
                return 528;
            case 482:
                return 529;
            case 483:
                return 530;
            case 484:
                return 531;
            case 485:
                return 532;
            case 486:
                return 533;
            case 487:
                return 534;
            case 488:
                return 535;
            case 2256:
                return 536;
            case 2257:
                return 537;
        }
        return -1;
    }

    public void combine(IntMap otherMap) {
        for (int index = 0; index <= 537; index++) {
            if (otherMap.mapData[index] != 0)
                mapData[index] = otherMap.mapData[index];
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof IntMap) {
            IntMap otherMap = (IntMap) other;
            for (int index = 0; index <= 537; index++) {
                if (mapData[index] != otherMap.mapData[index])
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return mapData.hashCode();
    }

    @Override
    public IntMap clone() {
        return new IntMap(mapData.clone());
    }
}
