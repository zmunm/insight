package io.github.zmunm.insight.service

import org.intellij.lang.annotations.Language

@Language("json")
internal val gameListResponse1 = """
{
    "count": 550423,
    "next": "https://api.rawg.io/api/games?key=d4377600d5454d1d80a3e2b004c4f69c&page=2",
    "previous": null,
    "results": [
        {
            "id": 3498,
            "slug": "grand-theft-auto-v",
            "name": "Grand Theft Auto V",
            "released": "2013-09-17",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg",
            "rating": 4.48,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 2820,
                    "percent": 59.23
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1563,
                    "percent": 32.83
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 301,
                    "percent": 6.32
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 77,
                    "percent": 1.62
                }
            ],
            "ratings_count": 4711,
            "reviews_text_count": 28,
            "added": 14769,
            "added_by_status": {
                "yet": 374,
                "owned": 8811,
                "beaten": 3921,
                "toplay": 408,
                "dropped": 723,
                "playing": 532
            },
            "metacritic": 97,
            "playtime": 70,
            "suggestions_count": 417,
            "updated": "2021-03-03T20:31:29",
            "user_game": null,
            "reviews_count": 4761,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 187,
                        "name": "PlayStation 5",
                        "slug": "playstation5",
                        "image": null,
                        "year_end": null,
                        "year_start": 2020,
                        "games_count": 202,
                        "image_background": "https://media.rawg.io/media/games/c2a/c2a7dc4540eb79aaff7099ae691105d3.jpg"
                    },
                    "released_at": "2013-09-17",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2013-09-17",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2013-09-17",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2013-09-17",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2013-09-17",
                    "requirements_en": {
                        "minimum": "Minimum:OS: Windows 10 64 Bit, Windows 8.1 64 Bit, Windows 8 64 Bit, Windows 7 64 Bit Service Pack 1, Windows Vista 64 Bit Service Pack 2* (*NVIDIA video card recommended if running Vista OS)Processor: Intel Core 2 Quad CPU Q6600 @ 2.40GHz (4 CPUs) / AMD Phenom 9850 Quad-Core Processor (4 CPUs) @ 2.5GHzMemory: 4 GB RAMGraphics: NVIDIA 9800 GT 1GB / AMD HD 4870 1GB (DX 10, 10.1, 11)Storage: 72 GB available spaceSound Card: 100% DirectX 10 compatibleAdditional Notes: Over time downloadable content and programming changes will change the system requirements for this game.  Please refer to your hardware manufacturer and www.rockstargames.com/support for current compatibility information. Some system components such as mobile chipsets, integrated, and AGP graphics cards may be incompatible. Unlisted specifications may not be supported by publisher.     Other requirements:  Installation and online play requires log-in to Rockstar Games Social Club (13+) network; internet connection required for activation, online play, and periodic entitlement verification; software installations required including Rockstar Games Social Club platform, DirectX , Chromium, and Microsoft Visual C++ 2008 sp1 Redistributable Package, and authentication software that recognizes certain hardware attributes for entitlement, digital rights management, system, and other support purposes.     SINGLE USE SERIAL CODE REGISTRATION VIA INTERNET REQUIRED; REGISTRATION IS LIMITED TO ONE ROCKSTAR GAMES SOCIAL CLUB ACCOUNT (13+) PER SERIAL CODE; ONLY ONE PC LOG-IN ALLOWED PER SOCIAL CLUB ACCOUNT AT ANY TIME; SERIAL CODE(S) ARE NON-TRANSFERABLE ONCE USED; SOCIAL CLUB ACCOUNTS ARE NON-TRANSFERABLE.  Partner Requirements:  Please check the terms of service of this site before purchasing this software.",
                        "recommended": "Recommended:OS: Windows 10 64 Bit, Windows 8.1 64 Bit, Windows 8 64 Bit, Windows 7 64 Bit Service Pack 1Processor: Intel Core i5 3470 @ 3.2GHz (4 CPUs) / AMD X8 FX-8350 @ 4GHz (8 CPUs)Memory: 8 GB RAMGraphics: NVIDIA GTX 660 2GB / AMD HD 7870 2GBStorage: 72 GB available spaceSound Card: 100% DirectX 10 compatibleAdditional Notes:"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2013-09-17",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 186,
                        "name": "Xbox Series S/X",
                        "slug": "xbox-series-x",
                        "image": null,
                        "year_end": null,
                        "year_start": 2020,
                        "games_count": 171,
                        "image_background": "https://media.rawg.io/media/games/aea/aea1581227fa10cbc006a6594845a01e.jpg"
                    },
                    "released_at": "2013-09-17",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 84693,
                    "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                }
            ],
            "stores": [
                {
                    "id": 290375,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 438095,
                    "store": {
                        "id": 11,
                        "name": "Epic Games",
                        "slug": "epic-games",
                        "domain": "epicgames.com",
                        "games_count": 517,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 290376,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 290377,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                },
                {
                    "id": 290378,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11667,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3671,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2756,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4168,
                    "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 12988,
                    "image_background": "https://media.rawg.io/media/screenshots/f2f/f2f3c93d6153da7aee590f3ab8ccd803.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3410,
                    "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6303,
                    "image_background": "https://media.rawg.io/media/screenshots/8f0/8f0b94922ad5e59968852649697b2643.jpg"
                },
                {
                    "id": 150,
                    "name": "Third-Person Shooter",
                    "slug": "third-person-shooter",
                    "language": "eng",
                    "games_count": 1466,
                    "image_background": "https://media.rawg.io/media/games/3cf/3cff89996570cf29a10eb9cd967dcf73.jpg"
                },
                {
                    "id": 62,
                    "name": "Moddable",
                    "slug": "moddable",
                    "language": "eng",
                    "games_count": 540,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 144,
                    "name": "Crime",
                    "slug": "crime",
                    "language": "eng",
                    "games_count": 1778,
                    "image_background": "https://media.rawg.io/media/games/fbb/fbbd9fe21317bde9134114e2b1306069.jpg"
                },
                {
                    "id": 62349,
                    "name": "vr mod",
                    "slug": "vr-mod",
                    "language": "eng",
                    "games_count": 19,
                    "image_background": "https://media.rawg.io/media/games/bda/bdab2603c0dc67268d0610449bc7df16.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 1827221,
                    "image": "https://media.rawg.io/media/screenshots/a7c/a7c43871a54bed6573a6a429451564ef.jpg"
                },
                {
                    "id": 1827222,
                    "image": "https://media.rawg.io/media/screenshots/cf4/cf4367daf6a1e33684bf19adb02d16d6.jpg"
                },
                {
                    "id": 1827223,
                    "image": "https://media.rawg.io/media/screenshots/f95/f9518b1d99210c0cae21fc09e95b4e31.jpg"
                },
                {
                    "id": 1827225,
                    "image": "https://media.rawg.io/media/screenshots/a5c/a5c95ea539c87d5f538763e16e18fb99.jpg"
                },
                {
                    "id": 1827226,
                    "image": "https://media.rawg.io/media/screenshots/a7e/a7e990bc574f4d34e03b5926361d1ee7.jpg"
                },
                {
                    "id": 1827227,
                    "image": "https://media.rawg.io/media/screenshots/592/592e2501d8734b802b2a34fee2df59fa.jpg"
                }
            ]
        },
        {
            "id": 4200,
            "slug": "portal-2",
            "name": "Portal 2",
            "released": "2011-04-18",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/328/3283617cb7d75d67257fc58339188742.jpg",
            "rating": 4.62,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 2775,
                    "percent": 70.29
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 996,
                    "percent": 25.23
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 105,
                    "percent": 2.66
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 72,
                    "percent": 1.82
                }
            ],
            "ratings_count": 3913,
            "reviews_text_count": 23,
            "added": 12888,
            "added_by_status": {
                "yet": 416,
                "owned": 8018,
                "beaten": 3750,
                "toplay": 234,
                "dropped": 362,
                "playing": 108
            },
            "metacritic": 95,
            "playtime": 11,
            "suggestions_count": 579,
            "updated": "2020-08-03T02:17:38",
            "user_game": null,
            "reviews_count": 3948,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2011-04-19",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70916,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2011-04-19",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 49795,
                        "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                    },
                    "released_at": "2011-04-19",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2011-04-19",
                    "requirements_en": null,
                    "requirements_ru": {
                        "minimum": "Core 2 Duo/Athlon X2 2 ГГц,1 Гб памяти,GeForce 7600/Radeon X800,10 Гб на винчестере,интернет-соединение",
                        "recommended": "Core 2 Duo/Athlon X2 2.5 ГГц,2 Гб памяти,GeForce GTX 280/Radeon HD 2600,10 Гб на винчестере,интернет-соединение"
                    }
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2011-04-19",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2011-04-18",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                }
            ],
            "genres": [
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                },
                {
                    "id": 7,
                    "name": "Puzzle",
                    "slug": "puzzle",
                    "games_count": 64158,
                    "image_background": "https://media.rawg.io/media/games/df2/df20fd77db56ae7b0a26a7ff4baa9ccc.jpg"
                }
            ],
            "stores": [
                {
                    "id": 465889,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 13134,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 4526,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 33916,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 9904,
                    "image_background": "https://media.rawg.io/media/games/48c/48cb04ca483be865e3a83119c94e6097.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2756,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10037,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 12988,
                    "image_background": "https://media.rawg.io/media/screenshots/f2f/f2f3c93d6153da7aee590f3ab8ccd803.jpg"
                },
                {
                    "id": 9,
                    "name": "Online Co-Op",
                    "slug": "online-co-op",
                    "language": "eng",
                    "games_count": 2647,
                    "image_background": "https://media.rawg.io/media/games/baf/baf9905270314e07e6850cffdb51df41.jpg"
                },
                {
                    "id": 189,
                    "name": "Female Protagonist",
                    "slug": "female-protagonist",
                    "language": "eng",
                    "games_count": 5486,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6303,
                    "image_background": "https://media.rawg.io/media/screenshots/8f0/8f0b94922ad5e59968852649697b2643.jpg"
                },
                {
                    "id": 75,
                    "name": "Local Co-Op",
                    "slug": "local-co-op",
                    "language": "eng",
                    "games_count": 3791,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 11669,
                    "name": "stats",
                    "slug": "stats",
                    "language": "eng",
                    "games_count": 3623,
                    "image_background": "https://media.rawg.io/media/games/93e/93ee6101e1c943732f06080dddb0fe4c.jpg"
                },
                {
                    "id": 40852,
                    "name": "Steam Workshop",
                    "slug": "steam-workshop",
                    "language": "eng",
                    "games_count": 1085,
                    "image_background": "https://media.rawg.io/media/games/a44/a444a7628bdb49b24d06a7672f805814.jpg"
                },
                {
                    "id": 40838,
                    "name": "Includes level editor",
                    "slug": "includes-level-editor",
                    "language": "eng",
                    "games_count": 1348,
                    "image_background": "https://media.rawg.io/media/games/7f0/7f021d4a3577ac9d591a628a431fc2e5.jpg"
                },
                {
                    "id": 25,
                    "name": "Space",
                    "slug": "space",
                    "language": "eng",
                    "games_count": 26832,
                    "image_background": "https://media.rawg.io/media/games/174/1743b3dd185bda4a7be349347d4064df.jpg"
                },
                {
                    "id": 40833,
                    "name": "Captions available",
                    "slug": "captions-available",
                    "language": "eng",
                    "games_count": 1040,
                    "image_background": "https://media.rawg.io/media/games/fee/fee0100afd87b52bfbd33e26689fa26c.jpg"
                },
                {
                    "id": 40834,
                    "name": "Commentary available",
                    "slug": "commentary-available",
                    "language": "eng",
                    "games_count": 220,
                    "image_background": "https://media.rawg.io/media/games/9e5/9e5b91a6d02e66b8d450a977a59ae123.jpg"
                },
                {
                    "id": 87,
                    "name": "Science",
                    "slug": "science",
                    "language": "eng",
                    "games_count": 1016,
                    "image_background": "https://media.rawg.io/media/screenshots/4f5/4f5ba4c03c5aea5d15b3067f894431cc.jpg"
                }
            ],
            "esrb_rating": {
                "id": 2,
                "name": "Everyone 10+",
                "slug": "everyone-10-plus"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/328/3283617cb7d75d67257fc58339188742.jpg"
                },
                {
                    "id": 99018,
                    "image": "https://media.rawg.io/media/screenshots/221/221a03c11e5ff9f765d62f60d4b4cbf5.jpg"
                },
                {
                    "id": 99019,
                    "image": "https://media.rawg.io/media/screenshots/173/1737ff43c14f40294011a209b1012875.jpg"
                },
                {
                    "id": 99020,
                    "image": "https://media.rawg.io/media/screenshots/b11/b11a2ae0664f0e8a1ef2346f99df26e1.jpg"
                },
                {
                    "id": 99021,
                    "image": "https://media.rawg.io/media/screenshots/9b1/9b107a790909b31918ebe2f40547cc85.jpg"
                },
                {
                    "id": 99022,
                    "image": "https://media.rawg.io/media/screenshots/d05/d058fc7f7fa6128916c311eb14267fed.jpg"
                },
                {
                    "id": 99023,
                    "image": "https://media.rawg.io/media/screenshots/415/41543dcc12dffc8e97d85a56ad42cda8.jpg"
                }
            ]
        },
        {
            "id": 3328,
            "slug": "the-witcher-3-wild-hunt",
            "name": "The Witcher 3: Wild Hunt",
            "released": "2015-05-18",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg",
            "rating": 4.67,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 3405,
                    "percent": 77.92
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 687,
                    "percent": 15.72
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 181,
                    "percent": 4.14
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 97,
                    "percent": 2.22
                }
            ],
            "ratings_count": 4305,
            "reviews_text_count": 47,
            "added": 12828,
            "added_by_status": {
                "yet": 708,
                "owned": 7281,
                "beaten": 3059,
                "toplay": 554,
                "dropped": 550,
                "playing": 676
            },
            "metacritic": 92,
            "playtime": 50,
            "suggestions_count": 672,
            "updated": "2020-10-02T00:57:03",
            "user_game": null,
            "reviews_count": 4370,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4350,
                        "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                    },
                    "released_at": "2015-05-18",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2015-05-18",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2015-05-18",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2015-05-18",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 84693,
                    "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 35928,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                }
            ],
            "stores": [
                {
                    "id": 354780,
                    "store": {
                        "id": 5,
                        "name": "GOG",
                        "slug": "gog",
                        "domain": "gog.com",
                        "games_count": 3283,
                        "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                    }
                },
                {
                    "id": 3565,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 305376,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 312313,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11667,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3671,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4168,
                    "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                },
                {
                    "id": 64,
                    "name": "Fantasy",
                    "slug": "fantasy",
                    "language": "eng",
                    "games_count": 12775,
                    "image_background": "https://media.rawg.io/media/games/4e6/4e6e8e7f50c237d76f38f3c885dae3d2.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3410,
                    "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                },
                {
                    "id": 97,
                    "name": "Action RPG",
                    "slug": "action-rpg",
                    "language": "eng",
                    "games_count": 3382,
                    "image_background": "https://media.rawg.io/media/games/ee3/ee3e10193aafc3230ba1cae426967d10.jpg"
                },
                {
                    "id": 41,
                    "name": "Dark",
                    "slug": "dark",
                    "language": "eng",
                    "games_count": 7173,
                    "image_background": "https://media.rawg.io/media/games/7f6/7f6cd70ba2ad57053b4847c13569f2d8.jpg"
                },
                {
                    "id": 44,
                    "name": "Nudity",
                    "slug": "nudity",
                    "language": "eng",
                    "games_count": 2543,
                    "image_background": "https://media.rawg.io/media/games/8ca/8ca40b562a755d6a0e30d48e6c74b178.jpg"
                },
                {
                    "id": 336,
                    "name": "controller support",
                    "slug": "controller-support",
                    "language": "eng",
                    "games_count": 293,
                    "image_background": "https://media.rawg.io/media/games/8a0/8a02f84a5916ede2f923b88d5f8217ba.jpg"
                },
                {
                    "id": 192,
                    "name": "Mature",
                    "slug": "mature",
                    "language": "eng",
                    "games_count": 870,
                    "image_background": "https://media.rawg.io/media/games/1bb/1bb86c35ffa3eb0d299b01a7c65bf908.jpg"
                },
                {
                    "id": 145,
                    "name": "Choices Matter",
                    "slug": "choices-matter",
                    "language": "eng",
                    "games_count": 1111,
                    "image_background": "https://media.rawg.io/media/games/d28/d285fcca7024c5e7144cf8b244be1337.jpg"
                },
                {
                    "id": 40,
                    "name": "Dark Fantasy",
                    "slug": "dark-fantasy",
                    "language": "eng",
                    "games_count": 1570,
                    "image_background": "https://media.rawg.io/media/games/511/5116b4524cea34c6b3f12e0ca027d850.jpg"
                },
                {
                    "id": 66,
                    "name": "Medieval",
                    "slug": "medieval",
                    "language": "eng",
                    "games_count": 2781,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 82,
                    "name": "Magic",
                    "slug": "magic",
                    "language": "eng",
                    "games_count": 4675,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 218,
                    "name": "Multiple Endings",
                    "slug": "multiple-endings",
                    "language": "eng",
                    "games_count": 3208,
                    "image_background": "https://media.rawg.io/media/games/7e7/7e79e3296a7f64e7535c9e5bb5aa4b53.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 30336,
                    "image": "https://media.rawg.io/media/screenshots/1ac/1ac19f31974314855ad7be266adeb500.jpg"
                },
                {
                    "id": 30337,
                    "image": "https://media.rawg.io/media/screenshots/6a0/6a08afca95261a2fe221ea9e01d28762.jpg"
                },
                {
                    "id": 30338,
                    "image": "https://media.rawg.io/media/screenshots/cdd/cdd31b6b4a687425a87b5ce231ac89d7.jpg"
                },
                {
                    "id": 30339,
                    "image": "https://media.rawg.io/media/screenshots/862/862397b153221a625922d3bb66337834.jpg"
                },
                {
                    "id": 30340,
                    "image": "https://media.rawg.io/media/screenshots/166/166787c442a45f52f4f230c33fd7d605.jpg"
                },
                {
                    "id": 30342,
                    "image": "https://media.rawg.io/media/screenshots/f63/f6373ee614046d81503d63f167181803.jpg"
                }
            ]
        },
        {
            "id": 5286,
            "slug": "tomb-raider",
            "name": "Tomb Raider (2013)",
            "released": "2013-03-05",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/ad2/ad2ffdf80ba993654f31da045bc02456.jpg",
            "rating": 4.06,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1674,
                    "percent": 60.39
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 711,
                    "percent": 25.65
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 315,
                    "percent": 11.36
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 72,
                    "percent": 2.6
                }
            ],
            "ratings_count": 2754,
            "reviews_text_count": 8,
            "added": 11647,
            "added_by_status": {
                "yet": 415,
                "owned": 7768,
                "beaten": 2873,
                "toplay": 169,
                "dropped": 335,
                "playing": 87
            },
            "metacritic": 86,
            "playtime": 11,
            "suggestions_count": 660,
            "updated": "2020-08-03T05:49:25",
            "user_game": null,
            "reviews_count": 2772,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2013-03-05",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2013-03-05",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324166,
                        "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                    },
                    "released_at": "2013-03-05",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong>Windows XP / Windows Vista / Windows 7<br>\t</li><li><strong>Processor:</strong>1.8 GHz Processor<br>\t</li><li><strong>Memory:</strong>512 MB RAM<br>\t</li><li><strong>Graphics:</strong>3D graphics card compatible with DirectX 9<br>\t</li><li><strong>DirectX®:</strong>9.0<br>\t</li><li><strong>Hard Drive:</strong>2 GB HD space</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "i486-100, 8 Мб",
                        "recommended": "Pentium 166, 16 Мб"
                    }
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2013-03-05",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2013-03-05",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70916,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2013-03-05",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 84693,
                    "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                }
            ],
            "stores": [
                {
                    "id": 33824,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                },
                {
                    "id": 13151,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 5640,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 218233,
                    "store": {
                        "id": 8,
                        "name": "Google Play",
                        "slug": "google-play",
                        "domain": "play.google.com",
                        "games_count": 16308,
                        "image_background": "https://media.rawg.io/media/games/6e0/6e0c19bb111bd4fa20cf0eb72a049519.jpg"
                    }
                },
                {
                    "id": 79036,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 68707,
                        "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11667,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4168,
                    "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1546,
                    "image_background": "https://media.rawg.io/media/games/ad2/ad2ffdf80ba993654f31da045bc02456.jpg"
                },
                {
                    "id": 189,
                    "name": "Female Protagonist",
                    "slug": "female-protagonist",
                    "language": "eng",
                    "games_count": 5486,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 6,
                    "name": "Exploration",
                    "slug": "exploration",
                    "language": "eng",
                    "games_count": 10134,
                    "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                },
                {
                    "id": 15,
                    "name": "Stealth",
                    "slug": "stealth",
                    "language": "eng",
                    "games_count": 3768,
                    "image_background": "https://media.rawg.io/media/games/364/3642d850efb217c58feab80b8affaa89.jpg"
                },
                {
                    "id": 150,
                    "name": "Third-Person Shooter",
                    "slug": "third-person-shooter",
                    "language": "eng",
                    "games_count": 1466,
                    "image_background": "https://media.rawg.io/media/games/3cf/3cff89996570cf29a10eb9cd967dcf73.jpg"
                },
                {
                    "id": 74,
                    "name": "Retro",
                    "slug": "retro",
                    "language": "eng",
                    "games_count": 20963,
                    "image_background": "https://media.rawg.io/media/games/6d3/6d33014a4ed48a19c30a77ead5a0f62e.jpg"
                },
                {
                    "id": 69,
                    "name": "Action-Adventure",
                    "slug": "action-adventure",
                    "language": "eng",
                    "games_count": 7594,
                    "image_background": "https://media.rawg.io/media/games/af7/af7a831001c5c32c46e950cc883b8cb7.jpg"
                },
                {
                    "id": 110,
                    "name": "Cinematic",
                    "slug": "cinematic",
                    "language": "eng",
                    "games_count": 452,
                    "image_background": "https://media.rawg.io/media/games/5c0/5c0dd63002cb23f804aab327d40ef119.jpg"
                },
                {
                    "id": 269,
                    "name": "Quick-Time Events",
                    "slug": "quick-time-events",
                    "language": "eng",
                    "games_count": 130,
                    "image_background": "https://media.rawg.io/media/games/471/4712c9ac591f556f553556b864a7e92b.jpg"
                },
                {
                    "id": 126,
                    "name": "Dinosaurs",
                    "slug": "dinosaurs",
                    "language": "eng",
                    "games_count": 1131,
                    "image_background": "https://media.rawg.io/media/games/5f4/5f44810c864fa054da5e0b84dc16267d.jpg"
                },
                {
                    "id": 306,
                    "name": "Lara Croft",
                    "slug": "lara-croft",
                    "language": "eng",
                    "games_count": 14,
                    "image_background": "https://media.rawg.io/media/games/7f6/7f6cd70ba2ad57053b4847c13569f2d8.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/ad2/ad2ffdf80ba993654f31da045bc02456.jpg"
                },
                {
                    "id": 99160,
                    "image": "https://media.rawg.io/media/screenshots/4f9/4f9d5efdecfb63cb99f1baa4c0ceb3bf.jpg"
                },
                {
                    "id": 99161,
                    "image": "https://media.rawg.io/media/screenshots/80f/80f373082b2a74da3f9c3fe2b877dcd0.jpg"
                },
                {
                    "id": 99162,
                    "image": "https://media.rawg.io/media/screenshots/a87/a8733e877f8fbe45e4a727c22a06aa2e.jpg"
                },
                {
                    "id": 99163,
                    "image": "https://media.rawg.io/media/screenshots/3f9/3f91678c6805a76419fa4ea3a045a909.jpg"
                },
                {
                    "id": 99164,
                    "image": "https://media.rawg.io/media/screenshots/417/4170bf07be43a8d8249193883f87f1c1.jpg"
                },
                {
                    "id": 99165,
                    "image": "https://media.rawg.io/media/screenshots/2a4/2a4250f83ad9e959d8b4ca9376ae34ea.jpg"
                }
            ]
        },
        {
            "id": 5679,
            "slug": "the-elder-scrolls-v-skyrim",
            "name": "The Elder Scrolls V: Skyrim",
            "released": "2011-11-11",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg",
            "rating": 4.43,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 1902,
                    "percent": 57.07
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1075,
                    "percent": 32.25
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 293,
                    "percent": 8.79
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 63,
                    "percent": 1.89
                }
            ],
            "ratings_count": 3307,
            "reviews_text_count": 16,
            "added": 11471,
            "added_by_status": {
                "yet": 350,
                "owned": 7124,
                "beaten": 2542,
                "toplay": 276,
                "dropped": 883,
                "playing": 296
            },
            "metacritic": 94,
            "playtime": 45,
            "suggestions_count": 618,
            "updated": "2020-07-06T04:26:04",
            "user_game": null,
            "reviews_count": 3333,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324166,
                        "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                    },
                    "released_at": "2011-11-11",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br>\t\t\t\t\t\t\t\t<ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7/Vista/XP PC (32 or 64 bit)<br>\t\t\t\t\t\t\t\t</li><li><strong>Processor:</strong> Dual Core 2.0GHz or equivalent processor<br>\t\t\t\t\t\t\t\t</li><li><strong>Memory:</strong> 2GB System RAM<br>\t\t\t\t\t\t\t\t</li><li><strong>Hard Disk Space:</strong> 6GB free HDD Space<br>\t\t\t\t\t\t\t\t</li><li><strong>Video Card:</strong> Direct X 9.0c compliant video card with 512 MB of RAM<br>\t\t\t\t\t\t\t\t</li><li><strong>Sound:</strong> DirectX compatible sound card<br>\t\t\t\t\t\t\t\t</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br>\t\t\t\t\t\t\t\t<ul class=\"bb_ul\"><li><strong>Processor:</strong> Quad-core Intel or AMD CPU<br>\t\t\t\t\t\t\t\t</li><li><strong>Memory:</strong> 4GB System RAM<br>\t\t\t\t\t\t\t\t</li><li><strong>Video Card:</strong> DirectX 9.0c compatible NVIDIA or AMD ATI video card with 1GB of RAM (Nvidia GeForce GTX 260 or higher; ATI Radeon 4890 or higher)<br>\t\t\t\t\t\t\t\t</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Core 2 Duo/Athlon X2 2 ГГц,2 Гб памяти,GeForce 8800/Radeon X1900,6 Гб на винчестере",
                        "recommended": "Core 2 Quad/Phenom X4 2.5 ГГц,4 Гб памяти,GeForce GTX 260/Radeon HD 4890,6 Гб на винчестере"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4350,
                        "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                    },
                    "released_at": "2011-11-11",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2011-11-11",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2011-11-11",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 35928,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                }
            ],
            "stores": [
                {
                    "id": 6037,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 15144,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 32919,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8639,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    }
                },
                {
                    "id": 49792,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 9904,
                    "image_background": "https://media.rawg.io/media/games/48c/48cb04ca483be865e3a83119c94e6097.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11667,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3671,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4168,
                    "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7242,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 64,
                    "name": "Fantasy",
                    "slug": "fantasy",
                    "language": "eng",
                    "games_count": 12775,
                    "image_background": "https://media.rawg.io/media/games/4e6/4e6e8e7f50c237d76f38f3c885dae3d2.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3410,
                    "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                },
                {
                    "id": 40852,
                    "name": "Steam Workshop",
                    "slug": "steam-workshop",
                    "language": "eng",
                    "games_count": 1085,
                    "image_background": "https://media.rawg.io/media/games/a44/a444a7628bdb49b24d06a7672f805814.jpg"
                },
                {
                    "id": 97,
                    "name": "Action RPG",
                    "slug": "action-rpg",
                    "language": "eng",
                    "games_count": 3382,
                    "image_background": "https://media.rawg.io/media/games/ee3/ee3e10193aafc3230ba1cae426967d10.jpg"
                },
                {
                    "id": 62,
                    "name": "Moddable",
                    "slug": "moddable",
                    "language": "eng",
                    "games_count": 540,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 468,
                    "name": "role-playing",
                    "slug": "role-playing",
                    "language": "eng",
                    "games_count": 1233,
                    "image_background": "https://media.rawg.io/media/games/704/704f831d2d132e9614931f1c4eab9e86.jpg"
                },
                {
                    "id": 121,
                    "name": "Character Customization",
                    "slug": "character-customization",
                    "language": "eng",
                    "games_count": 1417,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                },
                {
                    "id": 40,
                    "name": "Dark Fantasy",
                    "slug": "dark-fantasy",
                    "language": "eng",
                    "games_count": 1570,
                    "image_background": "https://media.rawg.io/media/games/511/5116b4524cea34c6b3f12e0ca027d850.jpg"
                },
                {
                    "id": 66,
                    "name": "Medieval",
                    "slug": "medieval",
                    "language": "eng",
                    "games_count": 2781,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 82,
                    "name": "Magic",
                    "slug": "magic",
                    "language": "eng",
                    "games_count": 4675,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 215,
                    "name": "Dragons",
                    "slug": "dragons",
                    "language": "eng",
                    "games_count": 1710,
                    "image_background": "https://media.rawg.io/media/screenshots/b8f/b8f5ee9d6c5322f4f9901397a8846d7a.jpg"
                },
                {
                    "id": 205,
                    "name": "Lore-Rich",
                    "slug": "lore-rich",
                    "language": "eng",
                    "games_count": 195,
                    "image_background": "https://media.rawg.io/media/screenshots/b63/b63f4f67aa366f9152fae90d839fb5b5.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                },
                {
                    "id": 118307,
                    "image": "https://media.rawg.io/media/screenshots/3bd/3bd2710bd1ffb6664fdea7b83afd067e.jpg"
                },
                {
                    "id": 118308,
                    "image": "https://media.rawg.io/media/screenshots/d4e/d4e9b13f54748584ccbd6f998094dade.jpg"
                },
                {
                    "id": 118309,
                    "image": "https://media.rawg.io/media/screenshots/599/59946a630e9c7871003763d63184404a.jpg"
                },
                {
                    "id": 118310,
                    "image": "https://media.rawg.io/media/screenshots/c5d/c5dad426038d7d12f933eedbeab48ff3.jpg"
                },
                {
                    "id": 118311,
                    "image": "https://media.rawg.io/media/screenshots/b32/b326fa01c82db82edd41ed299886ee44.jpg"
                },
                {
                    "id": 118312,
                    "image": "https://media.rawg.io/media/screenshots/091/091e95b49d5a22de036698fc731395a2.jpg"
                }
            ]
        },
        {
            "id": 12020,
            "slug": "left-4-dead-2",
            "name": "Left 4 Dead 2",
            "released": "2009-11-17",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg",
            "rating": 4.1,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1227,
                    "percent": 53.72
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 711,
                    "percent": 31.13
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 273,
                    "percent": 11.95
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 73,
                    "percent": 3.2
                }
            ],
            "ratings_count": 2274,
            "reviews_text_count": 5,
            "added": 11050,
            "added_by_status": {
                "yet": 270,
                "owned": 8206,
                "beaten": 1702,
                "toplay": 63,
                "dropped": 700,
                "playing": 109
            },
            "metacritic": 89,
            "playtime": 9,
            "suggestions_count": 602,
            "updated": "2020-12-02T13:36:02",
            "user_game": null,
            "reviews_count": 2284,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324166,
                        "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                    },
                    "released_at": "2009-11-17",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows® 7 32/64-bit / Vista 32/64 / XP<br></li><li><strong>Processor:</strong> Pentium 4 3.0GHz<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> Video card with 128 MB, Shader model 2.0. ATI X800, NVidia 6600 or better<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Storage:</strong> 13 GB available space<br></li><li><strong>Sound Card:</strong> DirectX 9.0c compatible sound card</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows® 7 32/64-bit / Vista 32/64 / XP<br></li><li><strong>Processor:</strong> Intel core 2 duo 2.4GHz<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> Video Card Shader model 3.0. NVidia 7600, ATI X1600 or better<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Storage:</strong> 13 GB available space<br></li><li><strong>Sound Card:</strong> DirectX 9.0c compatible sound card</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Pentium 4/Athlon 64 3 ГГц,1 Гб памяти,GeForce 6600/Radeon X800,7.5 Гб на винчестере",
                        "recommended": "Core 2 Duo/Athlon 64 X2 2.4 ГГц,2 Гб памяти,GeForce 7600/Radeon X1600,7.5 Гб на винчестере"
                    }
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2009-11-17",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 13208,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 34000,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 9904,
                    "image_background": "https://media.rawg.io/media/games/48c/48cb04ca483be865e3a83119c94e6097.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2756,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 16,
                    "name": "Horror",
                    "slug": "horror",
                    "language": "eng",
                    "games_count": 21231,
                    "image_background": "https://media.rawg.io/media/games/7c4/7c448374df84b607f67ce9182a3a3ca7.jpg"
                },
                {
                    "id": 9,
                    "name": "Online Co-Op",
                    "slug": "online-co-op",
                    "language": "eng",
                    "games_count": 2647,
                    "image_background": "https://media.rawg.io/media/games/baf/baf9905270314e07e6850cffdb51df41.jpg"
                },
                {
                    "id": 26,
                    "name": "Gore",
                    "slug": "gore",
                    "language": "eng",
                    "games_count": 3752,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 1,
                    "name": "Survival",
                    "slug": "survival",
                    "language": "eng",
                    "games_count": 4756,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 75,
                    "name": "Local Co-Op",
                    "slug": "local-co-op",
                    "language": "eng",
                    "games_count": 3791,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 80,
                    "name": "Tactical",
                    "slug": "tactical",
                    "language": "eng",
                    "games_count": 2267,
                    "image_background": "https://media.rawg.io/media/games/48e/48e63bbddeddbe9ba81942772b156664.jpg"
                },
                {
                    "id": 11669,
                    "name": "stats",
                    "slug": "stats",
                    "language": "eng",
                    "games_count": 3623,
                    "image_background": "https://media.rawg.io/media/games/93e/93ee6101e1c943732f06080dddb0fe4c.jpg"
                },
                {
                    "id": 40852,
                    "name": "Steam Workshop",
                    "slug": "steam-workshop",
                    "language": "eng",
                    "games_count": 1085,
                    "image_background": "https://media.rawg.io/media/games/a44/a444a7628bdb49b24d06a7672f805814.jpg"
                },
                {
                    "id": 63,
                    "name": "Zombies",
                    "slug": "zombies",
                    "language": "eng",
                    "games_count": 6704,
                    "image_background": "https://media.rawg.io/media/games/f14/f1422eacab98c5f85a5123da4e9d9e89.jpg"
                },
                {
                    "id": 62,
                    "name": "Moddable",
                    "slug": "moddable",
                    "language": "eng",
                    "games_count": 540,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 5,
                    "name": "Replay Value",
                    "slug": "replay-value",
                    "language": "eng",
                    "games_count": 896,
                    "image_background": "https://media.rawg.io/media/games/a12/a12f806432cb385bc286f0935c49cd14.jpg"
                },
                {
                    "id": 40833,
                    "name": "Captions available",
                    "slug": "captions-available",
                    "language": "eng",
                    "games_count": 1040,
                    "image_background": "https://media.rawg.io/media/games/fee/fee0100afd87b52bfbd33e26689fa26c.jpg"
                },
                {
                    "id": 43,
                    "name": "Post-apocalyptic",
                    "slug": "post-apocalyptic",
                    "language": "eng",
                    "games_count": 1812,
                    "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                },
                {
                    "id": 17,
                    "name": "Survival Horror",
                    "slug": "survival-horror",
                    "language": "eng",
                    "games_count": 4003,
                    "image_background": "https://media.rawg.io/media/games/f6f/f6f39c5b56413f7f4513b25989a1b747.jpg"
                },
                {
                    "id": 11,
                    "name": "Team-Based",
                    "slug": "team-based",
                    "language": "eng",
                    "games_count": 666,
                    "image_background": "https://media.rawg.io/media/games/48e/48e63bbddeddbe9ba81942772b156664.jpg"
                },
                {
                    "id": 40856,
                    "name": "Valve Anti-Cheat enabled",
                    "slug": "valve-anti-cheat-enabled",
                    "language": "eng",
                    "games_count": 104,
                    "image_background": "https://media.rawg.io/media/games/1a1/1a17e9b6286edb7e1f1e510110ccb0c0.jpg"
                },
                {
                    "id": 40834,
                    "name": "Commentary available",
                    "slug": "commentary-available",
                    "language": "eng",
                    "games_count": 220,
                    "image_background": "https://media.rawg.io/media/games/9e5/9e5b91a6d02e66b8d450a977a59ae123.jpg"
                },
                {
                    "id": 40839,
                    "name": "Includes Source SDK",
                    "slug": "includes-source-sdk",
                    "language": "eng",
                    "games_count": 55,
                    "image_background": "https://media.rawg.io/media/screenshots/4e5/4e5e71d53468bcf5d6686c46fec95d78.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 99748,
                    "image": "https://media.rawg.io/media/screenshots/4c0/4c043fd1a5ff78900483f2e82580fea0.jpg"
                },
                {
                    "id": 99749,
                    "image": "https://media.rawg.io/media/screenshots/c90/c9071628c238fbc20b366e2413dd8b4a.jpg"
                },
                {
                    "id": 99750,
                    "image": "https://media.rawg.io/media/screenshots/e29/e293b0f98092b8c0dbe24d66846088bb.jpg"
                },
                {
                    "id": 99751,
                    "image": "https://media.rawg.io/media/screenshots/168/16867bc76b385eb0fb749e41f7ada93d.jpg"
                },
                {
                    "id": 99752,
                    "image": "https://media.rawg.io/media/screenshots/fb9/fb917e562f311f48ff8d27632bd29a80.jpg"
                },
                {
                    "id": 99753,
                    "image": "https://media.rawg.io/media/screenshots/5f2/5f2ca569912add2a211b20ba3f576b97.jpg"
                }
            ]
        },
        {
            "id": 13536,
            "slug": "portal",
            "name": "Portal",
            "released": "2007-10-09",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg",
            "rating": 4.52,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 2032,
                    "percent": 61.35
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1085,
                    "percent": 32.76
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 135,
                    "percent": 4.08
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 60,
                    "percent": 1.81
                }
            ],
            "ratings_count": 3289,
            "reviews_text_count": 17,
            "added": 10927,
            "added_by_status": {
                "yet": 277,
                "owned": 6824,
                "beaten": 3386,
                "toplay": 148,
                "dropped": 244,
                "playing": 48
            },
            "metacritic": 90,
            "playtime": 4,
            "suggestions_count": 320,
            "updated": "2020-03-08T18:54:32",
            "user_game": null,
            "reviews_count": 3312,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 49795,
                        "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                    },
                    "released_at": "2007-10-09",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324166,
                        "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                    },
                    "released_at": "2007-10-09",
                    "requirements_en": {
                        "minimum": "<p><strong>Minimum: </strong>1.7 GHz Processor, 512MB RAM, DirectX&reg; 8.1 level Graphics Card (Requires support for SSE), Windows&reg; 7 (32/64-bit)/Vista/XP, Mouse, Keyboard, Internet Connection</p>\r\n\t\t\t<p><strong>Recommended: </strong>Pentium 4 processor (3.0GHz, or better), 1GB RAM, DirectX&reg; 9 level Graphics Card, Windows&reg; 7 (32/64-bit)/Vista/XP, Mouse, Keyboard, Internet Connection</p>"
                    },
                    "requirements_ru": {
                        "minimum": "Pentium 4/Athlon XP 1.7 ГГц,512 Мб памяти,3D-ускоритель со 128 Мб памяти,7.5 Гб на винчестере,Интернет-соединение 128 Кб/c",
                        "recommended": "Core 2 Duo/Athlon 64 3 ГГц,1 Гб памяти,3D-ускоритель с 512 Мб памяти,12 Гб на винчестере,Интернет-соединение 512 Кб/c"
                    }
                },
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37026,
                        "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                    },
                    "released_at": "2007-10-09",
                    "requirements_en": {
                        "minimum": "4.4 and up"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70916,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2007-10-09",
                    "requirements_en": {
                        "minimum": "<strong>Minimum: </strong>OS X version Leopard 10.5.8, Snow Leopard 10.6.3, 1GB RAM, NVIDIA GeForce 8 or higher, ATI X1600 or higher, or Intel HD 3000 or higher Mouse, Keyboard, Internet Connection"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2007-10-09",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2007-10-09",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 84693,
                    "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                },
                {
                    "id": 7,
                    "name": "Puzzle",
                    "slug": "puzzle",
                    "games_count": 64158,
                    "image_background": "https://media.rawg.io/media/games/df2/df20fd77db56ae7b0a26a7ff4baa9ccc.jpg"
                }
            ],
            "stores": [
                {
                    "id": 14890,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 40973,
                    "store": {
                        "id": 8,
                        "name": "Google Play",
                        "slug": "google-play",
                        "domain": "play.google.com",
                        "games_count": 16308,
                        "image_background": "https://media.rawg.io/media/games/6e0/6e0c19bb111bd4fa20cf0eb72a049519.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10037,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7242,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 12988,
                    "image_background": "https://media.rawg.io/media/screenshots/f2f/f2f3c93d6153da7aee590f3ab8ccd803.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1546,
                    "image_background": "https://media.rawg.io/media/games/ad2/ad2ffdf80ba993654f31da045bc02456.jpg"
                },
                {
                    "id": 189,
                    "name": "Female Protagonist",
                    "slug": "female-protagonist",
                    "language": "eng",
                    "games_count": 5486,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6303,
                    "image_background": "https://media.rawg.io/media/screenshots/8f0/8f0b94922ad5e59968852649697b2643.jpg"
                },
                {
                    "id": 40838,
                    "name": "Includes level editor",
                    "slug": "includes-level-editor",
                    "language": "eng",
                    "games_count": 1348,
                    "image_background": "https://media.rawg.io/media/games/7f0/7f021d4a3577ac9d591a628a431fc2e5.jpg"
                },
                {
                    "id": 111,
                    "name": "Short",
                    "slug": "short",
                    "language": "eng",
                    "games_count": 24331,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 40833,
                    "name": "Captions available",
                    "slug": "captions-available",
                    "language": "eng",
                    "games_count": 1040,
                    "image_background": "https://media.rawg.io/media/games/fee/fee0100afd87b52bfbd33e26689fa26c.jpg"
                },
                {
                    "id": 114,
                    "name": "Physics",
                    "slug": "physics",
                    "language": "eng",
                    "games_count": 12295,
                    "image_background": "https://media.rawg.io/media/games/9c5/9c504c944a201f6b3b868a35a65a6740.jpg"
                },
                {
                    "id": 40834,
                    "name": "Commentary available",
                    "slug": "commentary-available",
                    "language": "eng",
                    "games_count": 220,
                    "image_background": "https://media.rawg.io/media/games/9e5/9e5b91a6d02e66b8d450a977a59ae123.jpg"
                },
                {
                    "id": 148,
                    "name": "Dark Humor",
                    "slug": "dark-humor",
                    "language": "eng",
                    "games_count": 1514,
                    "image_background": "https://media.rawg.io/media/screenshots/7ab/7ab68441389f60523d2f6cb75c6393f2.jpg"
                },
                {
                    "id": 40839,
                    "name": "Includes Source SDK",
                    "slug": "includes-source-sdk",
                    "language": "eng",
                    "games_count": 55,
                    "image_background": "https://media.rawg.io/media/screenshots/4e5/4e5e71d53468bcf5d6686c46fec95d78.jpg"
                },
                {
                    "id": 87,
                    "name": "Science",
                    "slug": "science",
                    "language": "eng",
                    "games_count": 1016,
                    "image_background": "https://media.rawg.io/media/screenshots/4f5/4f5ba4c03c5aea5d15b3067f894431cc.jpg"
                }
            ],
            "esrb_rating": {
                "id": 3,
                "name": "Teen",
                "slug": "teen"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 115793,
                    "image": "https://media.rawg.io/media/screenshots/99e/99e94bd55eb75fa6e75c3dcbb1a570b2.jpg"
                },
                {
                    "id": 115794,
                    "image": "https://media.rawg.io/media/screenshots/2f0/2f0297a46934d9fa914c626902b1ce20.jpg"
                },
                {
                    "id": 115795,
                    "image": "https://media.rawg.io/media/screenshots/3b3/3b3713fbca6194dfc4d6e8a8d006d354.jpg"
                },
                {
                    "id": 115796,
                    "image": "https://media.rawg.io/media/screenshots/c6f/c6f9afc3e4dd51068b22f04acbc6ca99.jpg"
                },
                {
                    "id": 115797,
                    "image": "https://media.rawg.io/media/screenshots/748/74841207eec76ebc7fc03210168bfb7e.jpg"
                },
                {
                    "id": 115798,
                    "image": "https://media.rawg.io/media/screenshots/e72/e7256b4caedf099bcb8ebd332f892334.jpg"
                }
            ]
        },
        {
            "id": 802,
            "slug": "borderlands-2",
            "name": "Borderlands 2",
            "released": "2012-09-18",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/588/588c6bdff3d4baf66ec36b1c05b793bf.jpg",
            "rating": 4.05,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1156,
                    "percent": 47.95
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 774,
                    "percent": 32.1
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 393,
                    "percent": 16.3
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 88,
                    "percent": 3.65
                }
            ],
            "ratings_count": 2399,
            "reviews_text_count": 8,
            "added": 10926,
            "added_by_status": {
                "yet": 428,
                "owned": 7667,
                "beaten": 1646,
                "toplay": 135,
                "dropped": 858,
                "playing": 192
            },
            "metacritic": 89,
            "playtime": 10,
            "suggestions_count": 671,
            "updated": "2020-08-07T02:30:06",
            "user_game": null,
            "reviews_count": 2411,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2012-09-18",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2012-09-18",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2012-09-18",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2012-09-18",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP SP3<br>\t</li><li><strong>Processor:</strong> 2.4 GHz Dual Core Processor<br>\t</li><li><strong>Memory:</strong> 2 GB(XP)/ 2 GB(Vista)<br>\t</li><li><strong>Hard Disk Space:</strong> 13 GB free<br>\t</li><li><strong>Video Memory:</strong> 256 MB<br>\t</li><li><strong>Video Card:</strong> NVIDIA GeForce 8500 /ATI Radeon HD 2600<br>\t</li><li><strong>Sound:</strong> DirectX 9.0c Compatible<br>\t</li><li><strong>Other Requirements:</strong>Initial installation requires one-time internet connection for Steam authentication; software installations required (included with the game) include Steam Client, DirectX 9, Microsoft .NET 4 Framework, Visual C++ Redistributable 2005, Visual C++ Redistributable 2008, Visual C++ Redistributable 2010, and AMD CPU Drivers (XP Only/AMD Only)</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP SP3/Vista/Win 7<br>\t</li><li><strong>Processor:</strong> 2.3 GHz Quad Core processor<br>\t</li><li><strong>Memory:</strong> 2 GB<br>\t</li><li><strong>Hard Disk Space:</strong> 20 GB free<br>\t</li><li><strong>Video Memory:</strong> 512MB<br>\t</li><li><strong>Video Card:</strong> NVIDIA GeForce GTX 560 / ATI Radeon HD 5850<br>\t</li><li><strong>Sound:</strong> DirectX 9.0c Compatible<br>\t</li><li><strong>Other Requirements:</strong>Initial installation requires one-time internet connection for Steam authentication; software installations required (included with the game) include Steam Client, DirectX 9, Microsoft .NET 4 Framework, Visual C++ Redistributable 2005, Visual C++ Redistributable 2008, Visual C++ Redistributable 2010, and AMD CPU Drivers (XP Only/AMD Only)</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Core 2 Duo/Athlon 64 X2 2.4 ГГц,2 Гб памяти,GeForce 8500/Radeon HD 2600,13 Гб на винчестере,интернет-соединение",
                        "recommended": "Core i5/Phenom X4 2.3 ГГц,2 Гб памяти,GeForce GTX 560/Radeon HD 5850,20 Гб на винчестере,интернет-соединение"
                    }
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2012-09-18",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70916,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2012-09-18",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 35928,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                }
            ],
            "stores": [
                {
                    "id": 4000,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 213037,
                    "store": {
                        "id": 8,
                        "name": "Google Play",
                        "slug": "google-play",
                        "domain": "play.google.com",
                        "games_count": 16308,
                        "image_background": "https://media.rawg.io/media/games/6e0/6e0c19bb111bd4fa20cf0eb72a049519.jpg"
                    }
                },
                {
                    "id": 11088,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 34042,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                },
                {
                    "id": 71617,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 68707,
                        "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                    }
                },
                {
                    "id": 817,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 9904,
                    "image_background": "https://media.rawg.io/media/games/48c/48cb04ca483be865e3a83119c94e6097.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11667,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3671,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2756,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10037,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 12988,
                    "image_background": "https://media.rawg.io/media/screenshots/f2f/f2f3c93d6153da7aee590f3ab8ccd803.jpg"
                },
                {
                    "id": 9,
                    "name": "Online Co-Op",
                    "slug": "online-co-op",
                    "language": "eng",
                    "games_count": 2647,
                    "image_background": "https://media.rawg.io/media/games/baf/baf9905270314e07e6850cffdb51df41.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6303,
                    "image_background": "https://media.rawg.io/media/screenshots/8f0/8f0b94922ad5e59968852649697b2643.jpg"
                },
                {
                    "id": 97,
                    "name": "Action RPG",
                    "slug": "action-rpg",
                    "language": "eng",
                    "games_count": 3382,
                    "image_background": "https://media.rawg.io/media/games/ee3/ee3e10193aafc3230ba1cae426967d10.jpg"
                },
                {
                    "id": 120,
                    "name": "Memes",
                    "slug": "memes",
                    "language": "eng",
                    "games_count": 1063,
                    "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                },
                {
                    "id": 167,
                    "name": "Futuristic",
                    "slug": "futuristic",
                    "language": "eng",
                    "games_count": 2200,
                    "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                },
                {
                    "id": 148,
                    "name": "Dark Humor",
                    "slug": "dark-humor",
                    "language": "eng",
                    "games_count": 1514,
                    "image_background": "https://media.rawg.io/media/screenshots/7ab/7ab68441389f60523d2f6cb75c6393f2.jpg"
                },
                {
                    "id": 98,
                    "name": "Loot",
                    "slug": "loot",
                    "language": "eng",
                    "games_count": 1199,
                    "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                },
                {
                    "id": 166,
                    "name": "Stylized",
                    "slug": "stylized",
                    "language": "eng",
                    "games_count": 1346,
                    "image_background": "https://media.rawg.io/media/games/8cd/8cd179c85bd3de8f79bef245b15075fb.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/588/588c6bdff3d4baf66ec36b1c05b793bf.jpg"
                },
                {
                    "id": 7041,
                    "image": "https://media.rawg.io/media/screenshots/adb/adbbb37113618ee107459cd5c344f2a8.jpg"
                },
                {
                    "id": 7062,
                    "image": "https://media.rawg.io/media/screenshots/616/61643dd96e936d29eb68cf53b2334e53.jpg"
                },
                {
                    "id": 7070,
                    "image": "https://media.rawg.io/media/screenshots/864/8644946ba14a03ab69f0766c42a03f80.jpg"
                },
                {
                    "id": 7072,
                    "image": "https://media.rawg.io/media/screenshots/f87/f87ad2b8f02b56e36c57b25cf8eac042.jpg"
                },
                {
                    "id": 7081,
                    "image": "https://media.rawg.io/media/screenshots/194/194e0962afa272604300001718a07793.jpg"
                },
                {
                    "id": 7088,
                    "image": "https://media.rawg.io/media/screenshots/297/29716964351ecd82545f1de3a50dfc4e.jpg"
                }
            ]
        },
        {
            "id": 4062,
            "slug": "bioshock-infinite",
            "name": "BioShock Infinite",
            "released": "2013-03-26",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg",
            "rating": 4.39,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 1658,
                    "percent": 55.25
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1000,
                    "percent": 33.32
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 269,
                    "percent": 8.96
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 74,
                    "percent": 2.47
                }
            ],
            "ratings_count": 2976,
            "reviews_text_count": 17,
            "added": 10880,
            "added_by_status": {
                "yet": 549,
                "owned": 6598,
                "beaten": 3078,
                "toplay": 264,
                "dropped": 323,
                "playing": 68
            },
            "metacritic": 94,
            "playtime": 12,
            "suggestions_count": 600,
            "updated": "2020-08-03T02:19:32",
            "user_game": null,
            "reviews_count": 3001,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2013-03-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4350,
                        "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                    },
                    "released_at": "2013-03-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2013-03-26",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows Vista Service Pack 2 32-bit<br>\t</li><li><strong>Processor:</strong> Intel Core 2 DUO 2.4 GHz / AMD Athlon X2 2.7 GHz<br>\t</li><li><strong>Memory:</strong> 2GB<br>\t</li><li><strong>Hard Disk Space:</strong> 20 GB free<br>\t</li><li><strong>Video Card:</strong> DirectX10 Compatible ATI Radeon HD 3870 / NVIDIA 8800 GT / Intel HD 3000 Integrated Graphics<br>\t</li><li><strong>Video Card Memory:</strong> 512 MB\t<br>\t</li><li><strong>Sound:</strong> DirectX Compatible</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7 Service Pack 1 64-bit<br>\t</li><li><strong>Processor:</strong> Quad Core Processor<br>\t</li><li><strong>Memory:</strong> 4GB<br>\t</li><li><strong>Hard Disk Space:</strong> 30 GB free<br>\t</li><li><strong>Video Card:</strong> DirectX11 Compatible, AMD Radeon HD 6950 / NVIDIA GeForce GTX 560<br>\t</li><li><strong>Video Card Memory:</strong> 1024 MB\t<br>\t</li><li><strong>Sound:</strong> DirectX Compatible</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Win Vista 32\nCore 2 Duo E4600/Athlon 64 X2 5200+\nGeForce GT 340/Radeon HD 3800\n2 GB RAM\n20 GB HDD",
                        "recommended": "Win 7 64\nCore 2 Quad Q6600/Athlon II X4 610e\nGeForce GTX 560/Radeon HD 6950\n4 GB RAM\n20 GB HDD"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 49795,
                        "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                    },
                    "released_at": "2013-03-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2013-03-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2013-03-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2013-03-26",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 71727,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 68707,
                        "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                    }
                },
                {
                    "id": 440409,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 461035,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8639,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    }
                },
                {
                    "id": 4382,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 13084,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 33810,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 9904,
                    "image_background": "https://media.rawg.io/media/games/48c/48cb04ca483be865e3a83119c94e6097.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11667,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10037,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 64,
                    "name": "Fantasy",
                    "slug": "fantasy",
                    "language": "eng",
                    "games_count": 12775,
                    "image_background": "https://media.rawg.io/media/games/4e6/4e6e8e7f50c237d76f38f3c885dae3d2.jpg"
                },
                {
                    "id": 26,
                    "name": "Gore",
                    "slug": "gore",
                    "language": "eng",
                    "games_count": 3752,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 115,
                    "name": "Controller",
                    "slug": "controller",
                    "language": "eng",
                    "games_count": 5355,
                    "image_background": "https://media.rawg.io/media/games/295/295eb868c241e6ad32ac033b8e6a2ede.jpg"
                },
                {
                    "id": 119,
                    "name": "Dystopian",
                    "slug": "dystopian",
                    "language": "eng",
                    "games_count": 977,
                    "image_background": "https://media.rawg.io/media/games/c80/c80bcf321da44d69b18a06c04d942662.jpg"
                },
                {
                    "id": 154,
                    "name": "Steampunk",
                    "slug": "steampunk",
                    "language": "eng",
                    "games_count": 728,
                    "image_background": "https://media.rawg.io/media/games/0b5/0b5410b1e4b3fb72696dcefbf4f1cf40.jpg"
                },
                {
                    "id": 305,
                    "name": "Linear",
                    "slug": "linear",
                    "language": "eng",
                    "games_count": 907,
                    "image_background": "https://media.rawg.io/media/games/c6f/c6fc62de480c614fed2b88df0155cdcd.jpg"
                },
                {
                    "id": 208,
                    "name": "Alternate History",
                    "slug": "alternate-history",
                    "language": "eng",
                    "games_count": 839,
                    "image_background": "https://media.rawg.io/media/games/c64/c64d2f63cabeab9126693b7d39539c8d.jpg"
                },
                {
                    "id": 317,
                    "name": "Time Travel",
                    "slug": "time-travel",
                    "language": "eng",
                    "games_count": 1053,
                    "image_background": "https://media.rawg.io/media/screenshots/120/120530499012ea0149cfe358330b10c9.jpg"
                },
                {
                    "id": 287,
                    "name": "Political",
                    "slug": "political",
                    "language": "eng",
                    "games_count": 332,
                    "image_background": "https://media.rawg.io/media/games/eff/eff7b309ae98c32b48f22a10e7523106.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                },
                {
                    "id": 98549,
                    "image": "https://media.rawg.io/media/screenshots/bf0/bf07e2c6d2c888d372917d9ef453c8a4.jpg"
                },
                {
                    "id": 98550,
                    "image": "https://media.rawg.io/media/screenshots/9d3/9d38833952812ad7888a6dc21699934f.jpg"
                },
                {
                    "id": 98551,
                    "image": "https://media.rawg.io/media/screenshots/595/59572d257b6797986e4eabcd1ee023fd.jpg"
                },
                {
                    "id": 98552,
                    "image": "https://media.rawg.io/media/screenshots/f71/f71c23eb76f050d6180490e82d58d799.jpg"
                },
                {
                    "id": 98553,
                    "image": "https://media.rawg.io/media/screenshots/871/8713411d5332ceb2b4092073a6f5f3f2.jpg"
                },
                {
                    "id": 98554,
                    "image": "https://media.rawg.io/media/screenshots/985/985b56daa78e0a23133518d4226e9f97.jpg"
                }
            ]
        },
        {
            "id": 4291,
            "slug": "counter-strike-global-offensive",
            "name": "Counter-Strike: Global Offensive",
            "released": "2012-08-21",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg",
            "rating": 3.59,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1087,
                    "percent": 47.55
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 606,
                    "percent": 26.51
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 361,
                    "percent": 15.79
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 232,
                    "percent": 10.15
                }
            ],
            "ratings_count": 2266,
            "reviews_text_count": 15,
            "added": 10858,
            "added_by_status": {
                "yet": 180,
                "owned": 8394,
                "beaten": 606,
                "toplay": 49,
                "dropped": 1194,
                "playing": 435
            },
            "metacritic": 81,
            "playtime": 59,
            "suggestions_count": 606,
            "updated": "2020-08-07T06:18:15",
            "user_game": null,
            "reviews_count": 2286,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324166,
                        "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                    },
                    "released_at": "2012-08-21",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows® 7/Vista/XP<br></li><li><strong>Processor:</strong> Intel® Core™ 2 Duo E6600 or AMD Phenom™ X3 8750 processor or better<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> Video card must be 256 MB or more and should be a DirectX 9-compatible with support for Pixel Shader 3.0<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Storage:</strong> 15 GB available space</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Сore 2 Duo/Athlon x2 64 1.8 ГГц,2 Гб памяти,GeForce 8800/Radeon X9800,7.6 Гб на винчестере,интернет-соединение",
                        "recommended": "Core 2 Duo E6600/Phenom X3 8750,4 Гб памяти,GeForce 480 GTX/Radeon HD 6970,7.6 Гб на винчестере,интернет-соединение"
                    }
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2012-08-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2012-08-21",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 4619,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 11489,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 49169,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2756,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 9,
                    "name": "Online Co-Op",
                    "slug": "online-co-op",
                    "language": "eng",
                    "games_count": 2647,
                    "image_background": "https://media.rawg.io/media/games/baf/baf9905270314e07e6850cffdb51df41.jpg"
                },
                {
                    "id": 80,
                    "name": "Tactical",
                    "slug": "tactical",
                    "language": "eng",
                    "games_count": 2267,
                    "image_background": "https://media.rawg.io/media/games/48e/48e63bbddeddbe9ba81942772b156664.jpg"
                },
                {
                    "id": 11669,
                    "name": "stats",
                    "slug": "stats",
                    "language": "eng",
                    "games_count": 3623,
                    "image_background": "https://media.rawg.io/media/games/93e/93ee6101e1c943732f06080dddb0fe4c.jpg"
                },
                {
                    "id": 40852,
                    "name": "Steam Workshop",
                    "slug": "steam-workshop",
                    "language": "eng",
                    "games_count": 1085,
                    "image_background": "https://media.rawg.io/media/games/a44/a444a7628bdb49b24d06a7672f805814.jpg"
                },
                {
                    "id": 62,
                    "name": "Moddable",
                    "slug": "moddable",
                    "language": "eng",
                    "games_count": 540,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 70,
                    "name": "War",
                    "slug": "war",
                    "language": "eng",
                    "games_count": 6529,
                    "image_background": "https://media.rawg.io/media/games/4e0/4e0e7b6d6906a131307c94266e5c9a1c.jpg"
                },
                {
                    "id": 157,
                    "name": "PvP",
                    "slug": "pvp",
                    "language": "eng",
                    "games_count": 3679,
                    "image_background": "https://media.rawg.io/media/games/b72/b7233d5d5b1e75e86bb860ccc7aeca85.jpg"
                },
                {
                    "id": 40837,
                    "name": "In-App Purchases",
                    "slug": "in-app-purchases",
                    "language": "eng",
                    "games_count": 1322,
                    "image_background": "https://media.rawg.io/media/games/2c8/2c89e43515ed12aee51becc3dcfd8e7e.jpg"
                },
                {
                    "id": 11,
                    "name": "Team-Based",
                    "slug": "team-based",
                    "language": "eng",
                    "games_count": 666,
                    "image_background": "https://media.rawg.io/media/games/48e/48e63bbddeddbe9ba81942772b156664.jpg"
                },
                {
                    "id": 131,
                    "name": "Fast-Paced",
                    "slug": "fast-paced",
                    "language": "eng",
                    "games_count": 6944,
                    "image_background": "https://media.rawg.io/media/games/3ea/3ea3c9bbd940b6cb7f2139e42d3d443f.jpg"
                },
                {
                    "id": 40856,
                    "name": "Valve Anti-Cheat enabled",
                    "slug": "valve-anti-cheat-enabled",
                    "language": "eng",
                    "games_count": 104,
                    "image_background": "https://media.rawg.io/media/games/1a1/1a17e9b6286edb7e1f1e510110ccb0c0.jpg"
                },
                {
                    "id": 170,
                    "name": "Competitive",
                    "slug": "competitive",
                    "language": "eng",
                    "games_count": 778,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 81,
                    "name": "Military",
                    "slug": "military",
                    "language": "eng",
                    "games_count": 599,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 77,
                    "name": "Realistic",
                    "slug": "realistic",
                    "language": "eng",
                    "games_count": 1401,
                    "image_background": "https://media.rawg.io/media/screenshots/fd4/fd4da6198e718001cd922f13b2e4d5bf.jpeg"
                },
                {
                    "id": 73,
                    "name": "e-sports",
                    "slug": "e-sports",
                    "language": "eng",
                    "games_count": 79,
                    "image_background": "https://media.rawg.io/media/screenshots/f2b/f2b17902186569c0270e9c1196c3ca1b.jpg"
                },
                {
                    "id": 245,
                    "name": "Trading",
                    "slug": "trading",
                    "language": "eng",
                    "games_count": 664,
                    "image_background": "https://media.rawg.io/media/screenshots/42e/42e99339ea2adc30900a64dfb8139e3b.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                },
                {
                    "id": 81644,
                    "image": "https://media.rawg.io/media/screenshots/ff1/ff16661bb15f7969b44f6c4118870e44.jpg"
                },
                {
                    "id": 81645,
                    "image": "https://media.rawg.io/media/screenshots/41b/41bb769d247412eac3336dec934aed72.jpg"
                },
                {
                    "id": 81646,
                    "image": "https://media.rawg.io/media/screenshots/754/754545acdbf71f56e8902a07c7d20696.jpg"
                },
                {
                    "id": 81647,
                    "image": "https://media.rawg.io/media/screenshots/fd8/fd873cab4c66db0b8e85d8a66e940074.jpg"
                },
                {
                    "id": 81648,
                    "image": "https://media.rawg.io/media/screenshots/7db/7db2954f7908b6749c36a5f3c9052f65.jpg"
                },
                {
                    "id": 81649,
                    "image": "https://media.rawg.io/media/screenshots/337/337a3e98b5933f456a2b37b59fab5f39.jpg"
                }
            ]
        },
        {
            "id": 3439,
            "slug": "life-is-strange-episode-1-2",
            "name": "Life is Strange",
            "released": "2015-01-29",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg",
            "rating": 4.11,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 1184,
                    "percent": 43.72
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 980,
                    "percent": 36.19
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 375,
                    "percent": 13.85
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 169,
                    "percent": 6.24
                }
            ],
            "ratings_count": 2684,
            "reviews_text_count": 17,
            "added": 10852,
            "added_by_status": {
                "yet": 574,
                "owned": 7065,
                "beaten": 2399,
                "toplay": 244,
                "dropped": 432,
                "playing": 138
            },
            "metacritic": 83,
            "playtime": 7,
            "suggestions_count": 528,
            "updated": "2020-06-29T10:40:03",
            "user_game": null,
            "reviews_count": 2708,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2015-01-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 49795,
                        "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                    },
                    "released_at": "2015-01-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2015-01-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70916,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2015-01-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "iOS",
                        "slug": "ios",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70297,
                        "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                    },
                    "released_at": "2015-01-29",
                    "requirements_en": {
                        "minimum": "iPhone 5s, iPad Air, iPad Air Cellular, iPad Mini Retina, iPad Mini Retina Cellular, iPhone 6, iPhone 6 Plus, iPad Air 2, iPad Air 2 Cellular, iPad Mini 3, iPad Mini 3 Cellular, iPod Touch Sixth Gen, iPhone 6s, iPhone 6s Plus, iPad Mini 4, iPad Mini 4 Cellular, iPad Pro, iPad Pro Cellular, iPad Pro 9.7, iPad Pro 9.7 Cellular, iPhone SE, iPhone 7, iPhone 7 Plus, iPad 6 1 1, iPad 6 1 2, iPad 7 1, iPad 7 2, iPad 7 3, iPad 7 4, iPhone 8, iPhone 8 Plus, iPhone X, iPad 7 5, iPad 7 6, iPhone X S, iPhone X S Max, iPhone X R, iPad 8 1 2, iPad 8 3 4, iPad 8 5 6, iPad 8 7 8, iPad Mini 5, iPad Mini 5 Cellular, iPad Air 3, iPad Air 3 Cellular, iPod Touch Seventh Gen"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2015-01-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37026,
                        "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                    },
                    "released_at": "2015-01-29",
                    "requirements_en": {
                        "minimum": "6.0 and up"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2015-01-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2015-01-29",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "iOS",
                        "slug": "ios"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                }
            ],
            "genres": [
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 84693,
                    "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                }
            ],
            "stores": [
                {
                    "id": 451321,
                    "store": {
                        "id": 5,
                        "name": "GOG",
                        "slug": "gog",
                        "domain": "gog.com",
                        "games_count": 3283,
                        "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                    }
                },
                {
                    "id": 3702,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 35603,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 35602,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 217695,
                    "store": {
                        "id": 8,
                        "name": "Google Play",
                        "slug": "google-play",
                        "domain": "play.google.com",
                        "games_count": 16308,
                        "image_background": "https://media.rawg.io/media/games/6e0/6e0c19bb111bd4fa20cf0eb72a049519.jpg"
                    }
                },
                {
                    "id": 245823,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                },
                {
                    "id": 44714,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 68707,
                        "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4168,
                    "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                },
                {
                    "id": 189,
                    "name": "Female Protagonist",
                    "slug": "female-protagonist",
                    "language": "eng",
                    "games_count": 5486,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 141,
                    "name": "Point & Click",
                    "slug": "point-click",
                    "language": "eng",
                    "games_count": 6793,
                    "image_background": "https://media.rawg.io/media/games/6a2/6a2e48933245e2cd3c92248c75c925e1.jpg"
                },
                {
                    "id": 41,
                    "name": "Dark",
                    "slug": "dark",
                    "language": "eng",
                    "games_count": 7173,
                    "image_background": "https://media.rawg.io/media/games/7f6/7f6cd70ba2ad57053b4847c13569f2d8.jpg"
                },
                {
                    "id": 111,
                    "name": "Short",
                    "slug": "short",
                    "language": "eng",
                    "games_count": 24331,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 117,
                    "name": "Mystery",
                    "slug": "mystery",
                    "language": "eng",
                    "games_count": 6859,
                    "image_background": "https://media.rawg.io/media/games/90c/90caf1fcb836cad70013452f6f239008.jpg"
                },
                {
                    "id": 145,
                    "name": "Choices Matter",
                    "slug": "choices-matter",
                    "language": "eng",
                    "games_count": 1111,
                    "image_background": "https://media.rawg.io/media/games/d28/d285fcca7024c5e7144cf8b244be1337.jpg"
                },
                {
                    "id": 120,
                    "name": "Memes",
                    "slug": "memes",
                    "language": "eng",
                    "games_count": 1063,
                    "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                },
                {
                    "id": 91,
                    "name": "Walking Simulator",
                    "slug": "walking-simulator",
                    "language": "eng",
                    "games_count": 3864,
                    "image_background": "https://media.rawg.io/media/games/d9f/d9f982e042df6263684ba1fdea3efc1c.jpg"
                },
                {
                    "id": 218,
                    "name": "Multiple Endings",
                    "slug": "multiple-endings",
                    "language": "eng",
                    "games_count": 3208,
                    "image_background": "https://media.rawg.io/media/games/7e7/7e79e3296a7f64e7535c9e5bb5aa4b53.jpg"
                },
                {
                    "id": 406,
                    "name": "Story",
                    "slug": "story",
                    "language": "eng",
                    "games_count": 8482,
                    "image_background": "https://media.rawg.io/media/games/8ee/8eed88e297441ef9202b5d1d35d7d86f.jpg"
                },
                {
                    "id": 232,
                    "name": "Episodic",
                    "slug": "episodic",
                    "language": "eng",
                    "games_count": 346,
                    "image_background": "https://media.rawg.io/media/screenshots/72c/72c1405b3524e40c44c7860f2b5fa7f9.jpg"
                },
                {
                    "id": 317,
                    "name": "Time Travel",
                    "slug": "time-travel",
                    "language": "eng",
                    "games_count": 1053,
                    "image_background": "https://media.rawg.io/media/screenshots/120/120530499012ea0149cfe358330b10c9.jpg"
                },
                {
                    "id": 295,
                    "name": "Soundtrack",
                    "slug": "soundtrack",
                    "language": "eng",
                    "games_count": 2115,
                    "image_background": "https://media.rawg.io/media/games/f3d/f3d16029b8a52c3e0d6420ac13f19821.jpg"
                },
                {
                    "id": 302,
                    "name": "Time Manipulation",
                    "slug": "time-manipulation",
                    "language": "eng",
                    "games_count": 165,
                    "image_background": "https://media.rawg.io/media/games/702/7020d1319d09e0c6a840aa08c5ce120f.jpg"
                },
                {
                    "id": 992,
                    "name": "student",
                    "slug": "student",
                    "language": "eng",
                    "games_count": 1027,
                    "image_background": "https://media.rawg.io/media/screenshots/891/891960121e1e98c4375a7a98edeba744.jpg"
                },
                {
                    "id": 2682,
                    "name": "strange",
                    "slug": "strange",
                    "language": "eng",
                    "games_count": 266,
                    "image_background": "https://media.rawg.io/media/screenshots/76d/76dc424931f6e32854fa9742259d0ef1.jpeg"
                },
                {
                    "id": 3197,
                    "name": "photography",
                    "slug": "photography",
                    "language": "eng",
                    "games_count": 146,
                    "image_background": "https://media.rawg.io/media/screenshots/ca2/ca21966d584d5cf4a541159a245856d0.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                },
                {
                    "id": 1826487,
                    "image": "https://media.rawg.io/media/screenshots/edf/edfcbdf85f02f871263dabf1b4f0aa87.jpg"
                },
                {
                    "id": 1826488,
                    "image": "https://media.rawg.io/media/screenshots/4c6/4c6da2f36396d4ed51f82ba6159fa39b.jpg"
                },
                {
                    "id": 1826489,
                    "image": "https://media.rawg.io/media/screenshots/6aa/6aa56ef1485c8b287a913fa842883daa.jpg"
                },
                {
                    "id": 1826490,
                    "image": "https://media.rawg.io/media/screenshots/cb1/cb148b52fe857f5b0b83ae9c01f56d8e.jpg"
                },
                {
                    "id": 1826491,
                    "image": "https://media.rawg.io/media/screenshots/aea/aea38b33b90054f8fe4cc8bb05253b1d.jpg"
                },
                {
                    "id": 1826492,
                    "image": "https://media.rawg.io/media/screenshots/c1d/c1d6333b2da0f920e8de10c14d3c6093.jpg"
                }
            ]
        },
        {
            "id": 13537,
            "slug": "half-life-2",
            "name": "Half-Life 2",
            "released": "2004-11-16",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg",
            "rating": 4.5,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 1731,
                    "percent": 63.41
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 766,
                    "percent": 28.06
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 162,
                    "percent": 5.93
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 71,
                    "percent": 2.6
                }
            ],
            "ratings_count": 2720,
            "reviews_text_count": 9,
            "added": 9916,
            "added_by_status": {
                "yet": 436,
                "owned": 6336,
                "beaten": 2544,
                "toplay": 193,
                "dropped": 338,
                "playing": 69
            },
            "metacritic": 96,
            "playtime": 7,
            "suggestions_count": 563,
            "updated": "2019-09-17T15:58:20",
            "user_game": null,
            "reviews_count": 2730,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324166,
                        "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                    },
                    "released_at": "2004-11-16",
                    "requirements_en": null,
                    "requirements_ru": {
                        "minimum": "Pentium III/Athlon 1.2 ГГц,256 Мб памяти,3D-ускоритель с 64 Мб памяти,5 Гб на винчестере,доступ в Интернет",
                        "recommended": "Pentium 4/Athlon XP 2.5 ГГц,512 Мб памяти,3D-ускоритель со 128 Мб памяти,5 Гб на винчестере,доступ в Интернет"
                    }
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2004-11-16",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 49795,
                        "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                    },
                    "released_at": "2004-11-16",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 80,
                        "name": "Xbox",
                        "slug": "xbox-old",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 686,
                        "image_background": "https://media.rawg.io/media/games/9d2/9d20a1fc6a860c879d69e40aee288593.jpg"
                    },
                    "released_at": "2004-11-16",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37026,
                        "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                    },
                    "released_at": "2004-11-16",
                    "requirements_en": {
                        "minimum": "4.4 and up"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70916,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2004-11-16",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 14891,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 41441,
                    "store": {
                        "id": 8,
                        "name": "Google Play",
                        "slug": "google-play",
                        "domain": "play.google.com",
                        "games_count": 16308,
                        "image_background": "https://media.rawg.io/media/games/6e0/6e0c19bb111bd4fa20cf0eb72a049519.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 9904,
                    "image_background": "https://media.rawg.io/media/games/48c/48cb04ca483be865e3a83119c94e6097.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10037,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7242,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 16,
                    "name": "Horror",
                    "slug": "horror",
                    "language": "eng",
                    "games_count": 21231,
                    "image_background": "https://media.rawg.io/media/games/7c4/7c448374df84b607f67ce9182a3a3ca7.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1546,
                    "image_background": "https://media.rawg.io/media/games/ad2/ad2ffdf80ba993654f31da045bc02456.jpg"
                },
                {
                    "id": 63,
                    "name": "Zombies",
                    "slug": "zombies",
                    "language": "eng",
                    "games_count": 6704,
                    "image_background": "https://media.rawg.io/media/games/f14/f1422eacab98c5f85a5123da4e9d9e89.jpg"
                },
                {
                    "id": 62,
                    "name": "Moddable",
                    "slug": "moddable",
                    "language": "eng",
                    "games_count": 540,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 40833,
                    "name": "Captions available",
                    "slug": "captions-available",
                    "language": "eng",
                    "games_count": 1040,
                    "image_background": "https://media.rawg.io/media/games/fee/fee0100afd87b52bfbd33e26689fa26c.jpg"
                },
                {
                    "id": 114,
                    "name": "Physics",
                    "slug": "physics",
                    "language": "eng",
                    "games_count": 12295,
                    "image_background": "https://media.rawg.io/media/games/9c5/9c504c944a201f6b3b868a35a65a6740.jpg"
                },
                {
                    "id": 172,
                    "name": "Aliens",
                    "slug": "aliens",
                    "language": "eng",
                    "games_count": 4184,
                    "image_background": "https://media.rawg.io/media/games/9d5/9d5aa70db8c16566d79712df6417d13a.jpg"
                },
                {
                    "id": 119,
                    "name": "Dystopian",
                    "slug": "dystopian",
                    "language": "eng",
                    "games_count": 977,
                    "image_background": "https://media.rawg.io/media/games/c80/c80bcf321da44d69b18a06c04d942662.jpg"
                },
                {
                    "id": 40839,
                    "name": "Includes Source SDK",
                    "slug": "includes-source-sdk",
                    "language": "eng",
                    "games_count": 55,
                    "image_background": "https://media.rawg.io/media/screenshots/4e5/4e5e71d53468bcf5d6686c46fec95d78.jpg"
                },
                {
                    "id": 319,
                    "name": "Silent Protagonist",
                    "slug": "silent-protagonist",
                    "language": "eng",
                    "games_count": 62,
                    "image_background": "https://media.rawg.io/media/screenshots/6e3/6e39d75aa32665ab6292a257dc199203.jpg"
                },
                {
                    "id": 62349,
                    "name": "vr mod",
                    "slug": "vr-mod",
                    "language": "eng",
                    "games_count": 19,
                    "image_background": "https://media.rawg.io/media/games/bda/bdab2603c0dc67268d0610449bc7df16.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 115804,
                    "image": "https://media.rawg.io/media/screenshots/8af/8af6188357426890cbc8c8a34d9e7b75.jpg"
                },
                {
                    "id": 115805,
                    "image": "https://media.rawg.io/media/screenshots/3b5/3b542c954ba5bd2f32da067c8122cd80.jpg"
                },
                {
                    "id": 115806,
                    "image": "https://media.rawg.io/media/screenshots/3d6/3d6066e45d259d2e83bf6767e6113d94.jpg"
                },
                {
                    "id": 115807,
                    "image": "https://media.rawg.io/media/screenshots/e49/e49327df2404df6c5dafa8eac7990852.jpg"
                },
                {
                    "id": 115808,
                    "image": "https://media.rawg.io/media/screenshots/5dd/5dd3e53131bbfe6278bd15b9abe261a0.jpg"
                },
                {
                    "id": 115809,
                    "image": "https://media.rawg.io/media/screenshots/e99/e995e154d4f9e2df0367adea528a72c5.jpg"
                }
            ]
        },
        {
            "id": 4286,
            "slug": "bioshock",
            "name": "BioShock",
            "released": "2007-08-21",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg",
            "rating": 4.39,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 1360,
                    "percent": 54.38
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 896,
                    "percent": 35.83
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 171,
                    "percent": 6.84
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 74,
                    "percent": 2.96
                }
            ],
            "ratings_count": 2475,
            "reviews_text_count": 17,
            "added": 9910,
            "added_by_status": {
                "yet": 426,
                "owned": 6378,
                "beaten": 2315,
                "toplay": 204,
                "dropped": 498,
                "playing": 89
            },
            "metacritic": 96,
            "playtime": 3,
            "suggestions_count": 658,
            "updated": "2020-08-03T02:18:53",
            "user_game": null,
            "reviews_count": 2501,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2007-08-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2007-08-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "iOS",
                        "slug": "ios",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70297,
                        "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                    },
                    "released_at": "2007-08-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70916,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2007-08-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2007-08-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324166,
                        "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                    },
                    "released_at": "2007-08-21",
                    "requirements_en": {
                        "minimum": "<h2 class=\"bb_tag\"><strong>Minimum: </strong></h2><ul class=\"bb_ul\"><li><strong>Operating System</strong>: Windows XP (with Service Pack 2) or Windows Vista<br></li><li><strong>CPU</strong>: Intel single-core Pentium 4 processor at 2.4GHz<br></li><li><strong>RAM</strong>: 1 GB<br></li><li><strong>Video Card</strong>: Direct X 9.0c compliant video card with 128MB RAM and Pixel Shader 3.0 (NVIDIA 6600 or better/ATI X1300 or better, excluding ATI X1550)<br></li><li><strong>Sound Card</strong>: 100% direct X 9.0c compatible sound card<br></li><li><strong>Hard Drive Space</strong>: 8GB<br></li><li>Game requires Internet connection for activation</li></ul>",
                        "recommended": "<h2 class=\"bb_tag\"><strong>Recommended: </strong></h2><ul class=\"bb_ul\"><li><strong>CPU</strong>: Intel Core 2 Duo processor<br></li><li><strong>RAM</strong>: 2GB<br></li><li><strong>Video Card</strong>: DX 9 - Direct X 9.0c compliant video card with 512 MB RAM and Pixel Shader 3.0 (NVIDIA GeForce 7900 GT or better), DX 10 - NVIDIA GeForce 8600 or better<br></li><li><strong>Sound Card</strong>: SoundBlaster(r) X-Fi(tm) series (optimized foruse with Creative Labs EAX ADVANCED HD 4.0 or EAX ADVANCED HD 5.0 compatible sound cards)</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Pentium 4/Athlon 64 2.5 ГГц,1 Гб памяти,3D-ускоритель со 128 Мб памяти и SM 3.0, 7.5 Гб на винчестере, Windows XP SP2 или Vista,Интернет-соединение",
                        "recommended": "Core 2 Duo/Athlon 64 X2 3 ГГц,2 Гб памяти,3D-ускоритель с 512 Мб памяти и SM 3.0, 7.5 Гб на винчестере, Windows Vista,Интернет-соединение"
                    }
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2010-07-06",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "iOS",
                        "slug": "ios"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 4614,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 79531,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 68707,
                        "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                    }
                },
                {
                    "id": 440407,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 20580,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 33844,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11667,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10037,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7242,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 16,
                    "name": "Horror",
                    "slug": "horror",
                    "language": "eng",
                    "games_count": 21231,
                    "image_background": "https://media.rawg.io/media/games/7c4/7c448374df84b607f67ce9182a3a3ca7.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1546,
                    "image_background": "https://media.rawg.io/media/games/ad2/ad2ffdf80ba993654f31da045bc02456.jpg"
                },
                {
                    "id": 97,
                    "name": "Action RPG",
                    "slug": "action-rpg",
                    "language": "eng",
                    "games_count": 3382,
                    "image_background": "https://media.rawg.io/media/games/ee3/ee3e10193aafc3230ba1cae426967d10.jpg"
                },
                {
                    "id": 41,
                    "name": "Dark",
                    "slug": "dark",
                    "language": "eng",
                    "games_count": 7173,
                    "image_background": "https://media.rawg.io/media/games/7f6/7f6cd70ba2ad57053b4847c13569f2d8.jpg"
                },
                {
                    "id": 119,
                    "name": "Dystopian",
                    "slug": "dystopian",
                    "language": "eng",
                    "games_count": 977,
                    "image_background": "https://media.rawg.io/media/games/c80/c80bcf321da44d69b18a06c04d942662.jpg"
                },
                {
                    "id": 154,
                    "name": "Steampunk",
                    "slug": "steampunk",
                    "language": "eng",
                    "games_count": 728,
                    "image_background": "https://media.rawg.io/media/games/0b5/0b5410b1e4b3fb72696dcefbf4f1cf40.jpg"
                },
                {
                    "id": 208,
                    "name": "Alternate History",
                    "slug": "alternate-history",
                    "language": "eng",
                    "games_count": 839,
                    "image_background": "https://media.rawg.io/media/games/c64/c64d2f63cabeab9126693b7d39539c8d.jpg"
                },
                {
                    "id": 287,
                    "name": "Political",
                    "slug": "political",
                    "language": "eng",
                    "games_count": 332,
                    "image_background": "https://media.rawg.io/media/games/eff/eff7b309ae98c32b48f22a10e7523106.jpg"
                },
                {
                    "id": 250,
                    "name": "Underwater",
                    "slug": "underwater",
                    "language": "eng",
                    "games_count": 1283,
                    "image_background": "https://media.rawg.io/media/screenshots/e92/e925675403902177874a4f7ab463e6c7.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 170993,
                    "image": "https://media.rawg.io/media/screenshots/01f/01f62d7064838a5c3202acfc61503487.jpg"
                },
                {
                    "id": 170994,
                    "image": "https://media.rawg.io/media/screenshots/7f5/7f517e07e36e4af5a7c0b86a7d42853f.jpg"
                },
                {
                    "id": 170995,
                    "image": "https://media.rawg.io/media/screenshots/aca/aca089b963a42ec4cbf56b5e5334af8e.jpg"
                },
                {
                    "id": 170996,
                    "image": "https://media.rawg.io/media/screenshots/3aa/3aa6f71eba1d64e671bd45826ca96560.jpg"
                },
                {
                    "id": 170997,
                    "image": "https://media.rawg.io/media/screenshots/d8e/d8ed29c7c0b41e4013588847944ed446.jpg"
                },
                {
                    "id": 170998,
                    "image": "https://media.rawg.io/media/screenshots/146/146e418797aca19296f90d259207414c.jpg"
                }
            ]
        },
        {
            "id": 1030,
            "slug": "limbo",
            "name": "Limbo",
            "released": "2010-07-21",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg",
            "rating": 4.17,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1264,
                    "percent": 52.1
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 858,
                    "percent": 35.37
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 231,
                    "percent": 9.52
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 73,
                    "percent": 3.01
                }
            ],
            "ratings_count": 2399,
            "reviews_text_count": 18,
            "added": 9829,
            "added_by_status": {
                "yet": 416,
                "owned": 6356,
                "beaten": 2306,
                "toplay": 204,
                "dropped": 473,
                "playing": 74
            },
            "metacritic": 88,
            "playtime": 3,
            "suggestions_count": 195,
            "updated": "2021-04-03T11:10:51",
            "user_game": null,
            "reviews_count": 2426,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37026,
                        "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": {
                        "minimum": "4.4 and up"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 19,
                        "name": "PS Vita",
                        "slug": "ps-vita",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 1934,
                        "image_background": "https://media.rawg.io/media/games/471/4712c9ac591f556f553556b864a7e92b.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4350,
                        "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 49795,
                        "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": {
                        "minimum": "<ul class=\"bb_ul\"><li><strong>OS:</strong> SteamOS, Ubuntu 12.04 or later, or otherwise compatible Linux distribution.<br>\t\t\t\t\t\t</li><li><strong>Processor:</strong> 2GHz<br>\t\t\t\t\t\t</li><li><strong>Memory:</strong> 1 GB RAM <br>\t\t\t\t\t\t</li><li><strong>Hard Disk Space:</strong> 150MB\t<br>\t\t\t\t\t\t</li><li><strong>Video Card:</strong> OpenGL 2.0 compatible video card with 256 MB shared or dedicated RAM <br>\t\t\t\t\t</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70916,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": {
                        "minimum": "Please be advised that LIMBO only runs Macs produced in 2009 and onwards.<br><ul class=\"bb_ul\"><li><strong>OS:</strong> OS X version Snow Leopard 10.6.3 or later.<br>\t\t\t\t\t\t</li><li><strong>Processor:</strong> Intel Mac<br>\t\t\t\t\t\t</li><li><strong>Memory:</strong> 1 GB RAM <br>\t\t\t\t\t\t</li><li><strong>Hard Disk Space:</strong> 150MB\t<br>\t\t\t\t\t\t</li><li><strong>Video Card:</strong> OpenGL 2.0 compatible video card with 256 MB shared or dedicated RAM (ATI or NVIDIA) <br>\t\t\t\t\t</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": {
                        "minimum": "<ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP, Vista, 7<br>\t\t\t\t\t\t</li><li><strong>Processor:</strong> 2 GHz<br>\t\t\t\t\t\t</li><li><strong>Memory:</strong> 512MB<br>\t\t\t\t\t\t</li><li><strong>Hard Disk Space:</strong> 150MB\t<br>\t\t\t\t\t\t</li><li><strong>Video Card:</strong> 5 years or younger. Integrated graphics and very low budget cards may not work. Shader Model 3.0 required<br>\t\t\t\t\t\t</li><li><strong>DirectX®:</strong> 9.0c\t<br>\t\t\t\t\t\t</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Pentium 4/Athlon XP 2 ГГц,512 Мб памяти,3D-ускоритель с 256 Мб памяти,150 Мб на винчестере",
                        "recommended": "Core 2 Duo/Atlon X2 2 ГГц,1 Гб памяти,3D-ускоритель с 512 Мб памяти,150 Мб на винчестере"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "iOS",
                        "slug": "ios",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70297,
                        "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": {
                        "minimum": "iPad 2 Wifi, iPad 2 3G, iPhone 4S, iPad Third Gen, iPad Third Gen 4G, iPhone 5, iPod Touch Fifth Gen, iPad Fourth Gen, iPad Fourth Gen 4G, iPad Mini, iPad Mini 4G, iPhone 5c, iPhone 5s, iPad Air, iPad Air Cellular, iPad Mini Retina, iPad Mini Retina Cellular, iPhone 6, iPhone 6 Plus, iPad Air 2, iPad Air 2 Cellular, iPad Mini 3, iPad Mini 3 Cellular, iPod Touch Sixth Gen, iPhone 6s, iPhone 6s Plus, iPad Mini 4, iPad Mini 4 Cellular, iPad Pro, iPad Pro Cellular, iPad Pro 9.7, iPad Pro 9.7 Cellular, iPhone SE, iPhone 7, iPhone 7 Plus, iPad 6 1 1, iPad 6 1 2, iPad 7 1, iPad 7 2, iPad 7 3, iPad 7 4, iPhone 8, iPhone 8 Plus, iPhone X, iPad 7 5, iPad 7 6, iPhone X S, iPhone X S Max, iPhone X R, iPad 8 1 2, iPad 8 3 4, iPad 8 5 6, iPad 8 7 8, iPad Mini 5, iPad Mini 5 Cellular, iPad Air 3, iPad Air 3 Cellular, iPod Touch Seventh Gen"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2010-07-21",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "iOS",
                        "slug": "ios"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 84693,
                    "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                },
                {
                    "id": 51,
                    "name": "Indie",
                    "slug": "indie",
                    "games_count": 36403,
                    "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                },
                {
                    "id": 7,
                    "name": "Puzzle",
                    "slug": "puzzle",
                    "games_count": 64158,
                    "image_background": "https://media.rawg.io/media/games/df2/df20fd77db56ae7b0a26a7ff4baa9ccc.jpg"
                },
                {
                    "id": 83,
                    "name": "Platformer",
                    "slug": "platformer",
                    "games_count": 59629,
                    "image_background": "https://media.rawg.io/media/games/c40/c40f9f0a3d1b4601a7a44d230c95f126.jpg"
                }
            ],
            "stores": [
                {
                    "id": 1054,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 68707,
                        "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                    }
                },
                {
                    "id": 3679,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 7493,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 10311,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 26852,
                    "store": {
                        "id": 5,
                        "name": "GOG",
                        "slug": "gog",
                        "domain": "gog.com",
                        "games_count": 3283,
                        "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                    }
                },
                {
                    "id": 33137,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                },
                {
                    "id": 49142,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8639,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    }
                },
                {
                    "id": 40035,
                    "store": {
                        "id": 8,
                        "name": "Google Play",
                        "slug": "google-play",
                        "domain": "play.google.com",
                        "games_count": 16308,
                        "image_background": "https://media.rawg.io/media/games/6e0/6e0c19bb111bd4fa20cf0eb72a049519.jpg"
                    }
                },
                {
                    "id": 335541,
                    "store": {
                        "id": 11,
                        "name": "Epic Games",
                        "slug": "epic-games",
                        "domain": "epicgames.com",
                        "games_count": 517,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 45,
                    "name": "2D",
                    "slug": "2d",
                    "language": "eng",
                    "games_count": 107374,
                    "image_background": "https://media.rawg.io/media/games/e40/e40cc9d1957b0a0ed7e389834457b524.jpg"
                },
                {
                    "id": 16,
                    "name": "Horror",
                    "slug": "horror",
                    "language": "eng",
                    "games_count": 21231,
                    "image_background": "https://media.rawg.io/media/games/7c4/7c448374df84b607f67ce9182a3a3ca7.jpg"
                },
                {
                    "id": 49,
                    "name": "Difficult",
                    "slug": "difficult",
                    "language": "eng",
                    "games_count": 8254,
                    "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                },
                {
                    "id": 115,
                    "name": "Controller",
                    "slug": "controller",
                    "language": "eng",
                    "games_count": 5355,
                    "image_background": "https://media.rawg.io/media/games/295/295eb868c241e6ad32ac033b8e6a2ede.jpg"
                },
                {
                    "id": 41,
                    "name": "Dark",
                    "slug": "dark",
                    "language": "eng",
                    "games_count": 7173,
                    "image_background": "https://media.rawg.io/media/games/7f6/7f6cd70ba2ad57053b4847c13569f2d8.jpg"
                },
                {
                    "id": 336,
                    "name": "controller support",
                    "slug": "controller-support",
                    "language": "eng",
                    "games_count": 293,
                    "image_background": "https://media.rawg.io/media/games/8a0/8a02f84a5916ede2f923b88d5f8217ba.jpg"
                },
                {
                    "id": 111,
                    "name": "Short",
                    "slug": "short",
                    "language": "eng",
                    "games_count": 24331,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 113,
                    "name": "Side Scroller",
                    "slug": "side-scroller",
                    "language": "eng",
                    "games_count": 5277,
                    "image_background": "https://media.rawg.io/media/games/f8c/f8c6a262ead4c16b47e1219310210eb3.jpg"
                },
                {
                    "id": 114,
                    "name": "Physics",
                    "slug": "physics",
                    "language": "eng",
                    "games_count": 12295,
                    "image_background": "https://media.rawg.io/media/games/9c5/9c504c944a201f6b3b868a35a65a6740.jpg"
                },
                {
                    "id": 110,
                    "name": "Cinematic",
                    "slug": "cinematic",
                    "language": "eng",
                    "games_count": 452,
                    "image_background": "https://media.rawg.io/media/games/5c0/5c0dd63002cb23f804aab327d40ef119.jpg"
                },
                {
                    "id": 83,
                    "name": "Puzzle-Platformer",
                    "slug": "puzzle-platformer",
                    "language": "eng",
                    "games_count": 6850,
                    "image_background": "https://media.rawg.io/media/screenshots/b4a/b4ab3798b6f64d3b2866959090b1843a.jpg"
                },
                {
                    "id": 46,
                    "name": "Surreal",
                    "slug": "surreal",
                    "language": "eng",
                    "games_count": 2698,
                    "image_background": "https://media.rawg.io/media/screenshots/5a3/5a36930b16d9b1949d8c8c92b5a28d89.jpg"
                },
                {
                    "id": 112,
                    "name": "Minimalist",
                    "slug": "minimalist",
                    "language": "eng",
                    "games_count": 8230,
                    "image_background": "https://media.rawg.io/media/screenshots/74e/74edf732973b75843759b9b23d05b847.jpg"
                }
            ],
            "esrb_rating": {
                "id": 3,
                "name": "Teen",
                "slug": "teen"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                },
                {
                    "id": 30985,
                    "image": "https://media.rawg.io/media/screenshots/512/512f4bc2092016478ddcb9e7e60aeec0.jpg"
                },
                {
                    "id": 30986,
                    "image": "https://media.rawg.io/media/screenshots/63d/63d30699e8fcab9c808e6714d9d3fd59.jpg"
                },
                {
                    "id": 30987,
                    "image": "https://media.rawg.io/media/screenshots/de0/de04bbc0fd9904071ef25bf23113c8c4.jpg"
                },
                {
                    "id": 30988,
                    "image": "https://media.rawg.io/media/screenshots/eed/eedbbca4ae2debf2d4e23e55d1f6cff7.jpg"
                },
                {
                    "id": 30989,
                    "image": "https://media.rawg.io/media/screenshots/59f/59f472b3ed7b414777a29213d70b4d17.jpg"
                },
                {
                    "id": 30991,
                    "image": "https://media.rawg.io/media/screenshots/e58/e58d31146e4a9e3786dabcbfc30126bc.jpg"
                }
            ]
        },
        {
            "id": 28,
            "slug": "red-dead-redemption-2",
            "name": "Red Dead Redemption 2",
            "released": "2018-10-26",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg",
            "rating": 4.58,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 2415,
                    "percent": 72.24
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 636,
                    "percent": 19.02
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 194,
                    "percent": 5.8
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 98,
                    "percent": 2.93
                }
            ],
            "ratings_count": 3282,
            "reviews_text_count": 50,
            "added": 9828,
            "added_by_status": {
                "yet": 554,
                "owned": 5090,
                "beaten": 1845,
                "toplay": 1300,
                "dropped": 337,
                "playing": 702
            },
            "metacritic": 96,
            "playtime": 21,
            "suggestions_count": 630,
            "updated": "2020-11-23T02:33:54",
            "user_game": null,
            "reviews_count": 3343,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2018-10-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2018-10-26",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li>Requires a 64-bit processor and operating system<br></li><li><strong>OS:</strong> Windows 7 - Service Pack 1 (6.1.7601)<br></li><li><strong>Processor:</strong> Intel® Core™ i5-2500K / AMD FX-6300<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> Nvidia GeForce GTX 770 2GB / AMD Radeon R9 280 3GB<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 150 GB available space<br></li><li><strong>Sound Card:</strong> Direct X Compatible</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li>Requires a 64-bit processor and operating system<br></li><li><strong>OS:</strong> Windows 10 - April 2018 Update (v1803)<br></li><li><strong>Processor:</strong> Intel® Core™ i7-4770K / AMD Ryzen 5 1500X<br></li><li><strong>Memory:</strong> 12 GB RAM<br></li><li><strong>Graphics:</strong> Nvidia GeForce GTX 1060 6GB / AMD Radeon RX 480 4GB<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 150 GB available space<br></li><li><strong>Sound Card:</strong> Direct X Compatible</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2018-10-26",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 84693,
                    "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                }
            ],
            "stores": [
                {
                    "id": 257732,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 374316,
                    "store": {
                        "id": 11,
                        "name": "Epic Games",
                        "slug": "epic-games",
                        "domain": "epicgames.com",
                        "games_count": 517,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 384218,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 48782,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3671,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4168,
                    "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7242,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 9,
                    "name": "Online Co-Op",
                    "slug": "online-co-op",
                    "language": "eng",
                    "games_count": 2647,
                    "image_background": "https://media.rawg.io/media/games/baf/baf9905270314e07e6850cffdb51df41.jpg"
                },
                {
                    "id": 26,
                    "name": "Gore",
                    "slug": "gore",
                    "language": "eng",
                    "games_count": 3752,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3410,
                    "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                },
                {
                    "id": 6,
                    "name": "Exploration",
                    "slug": "exploration",
                    "language": "eng",
                    "games_count": 10134,
                    "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                },
                {
                    "id": 34,
                    "name": "Violent",
                    "slug": "violent",
                    "language": "eng",
                    "games_count": 4415,
                    "image_background": "https://media.rawg.io/media/games/e6d/e6de699bd788497f4b52e2f41f9698f2.jpg"
                },
                {
                    "id": 150,
                    "name": "Third-Person Shooter",
                    "slug": "third-person-shooter",
                    "language": "eng",
                    "games_count": 1466,
                    "image_background": "https://media.rawg.io/media/games/3cf/3cff89996570cf29a10eb9cd967dcf73.jpg"
                },
                {
                    "id": 157,
                    "name": "PvP",
                    "slug": "pvp",
                    "language": "eng",
                    "games_count": 3679,
                    "image_background": "https://media.rawg.io/media/games/b72/b7233d5d5b1e75e86bb860ccc7aeca85.jpg"
                },
                {
                    "id": 40837,
                    "name": "In-App Purchases",
                    "slug": "in-app-purchases",
                    "language": "eng",
                    "games_count": 1322,
                    "image_background": "https://media.rawg.io/media/games/2c8/2c89e43515ed12aee51becc3dcfd8e7e.jpg"
                },
                {
                    "id": 192,
                    "name": "Mature",
                    "slug": "mature",
                    "language": "eng",
                    "games_count": 870,
                    "image_background": "https://media.rawg.io/media/games/1bb/1bb86c35ffa3eb0d299b01a7c65bf908.jpg"
                },
                {
                    "id": 89,
                    "name": "Historical",
                    "slug": "historical",
                    "language": "eng",
                    "games_count": 1167,
                    "image_background": "https://media.rawg.io/media/games/39a/39a8aa7798b685f9625e857bc394259d.jpg"
                },
                {
                    "id": 110,
                    "name": "Cinematic",
                    "slug": "cinematic",
                    "language": "eng",
                    "games_count": 452,
                    "image_background": "https://media.rawg.io/media/games/5c0/5c0dd63002cb23f804aab327d40ef119.jpg"
                },
                {
                    "id": 77,
                    "name": "Realistic",
                    "slug": "realistic",
                    "language": "eng",
                    "games_count": 1401,
                    "image_background": "https://media.rawg.io/media/screenshots/fd4/fd4da6198e718001cd922f13b2e4d5bf.jpeg"
                },
                {
                    "id": 144,
                    "name": "Crime",
                    "slug": "crime",
                    "language": "eng",
                    "games_count": 1778,
                    "image_background": "https://media.rawg.io/media/games/fbb/fbbd9fe21317bde9134114e2b1306069.jpg"
                },
                {
                    "id": 478,
                    "name": "3rd-Person Perspective",
                    "slug": "3rd-person-perspective",
                    "language": "eng",
                    "games_count": 82,
                    "image_background": "https://media.rawg.io/media/games/d89/d89bd0cf4fcdc10820892980cbba0f49.jpg"
                },
                {
                    "id": 270,
                    "name": "Blood",
                    "slug": "blood",
                    "language": "eng",
                    "games_count": 1464,
                    "image_background": "https://media.rawg.io/media/games/fbc/fbced95c523be0444ce6d2fa83b1afc0.jpg"
                },
                {
                    "id": 78,
                    "name": "America",
                    "slug": "america",
                    "language": "eng",
                    "games_count": 187,
                    "image_background": "https://media.rawg.io/media/games/eb2/eb24800b4491701eca481e7c990bce4a.jpg"
                },
                {
                    "id": 45878,
                    "name": "Online PvP",
                    "slug": "online-pvp",
                    "language": "eng",
                    "games_count": 1131,
                    "image_background": "https://media.rawg.io/media/screenshots/790/79000406c1177ff49911f08022fc40b9.jpg"
                },
                {
                    "id": 578,
                    "name": "Masterpiece",
                    "slug": "masterpiece",
                    "language": "eng",
                    "games_count": 188,
                    "image_background": "https://media.rawg.io/media/games/31c/31c3bc7e7296ac5ec6cca8407cd992e4.jpg"
                },
                {
                    "id": 181,
                    "name": "Hunting",
                    "slug": "hunting",
                    "language": "eng",
                    "games_count": 631,
                    "image_background": "https://media.rawg.io/media/screenshots/496/496a873faaee08ff2a9f2b0d40e9ee05.jpg"
                },
                {
                    "id": 577,
                    "name": "Beautiful",
                    "slug": "beautiful",
                    "language": "eng",
                    "games_count": 1623,
                    "image_background": "https://media.rawg.io/media/screenshots/b65/b6595583c96f335a79c5cb918cc4ed03.jpg"
                },
                {
                    "id": 152,
                    "name": "Western",
                    "slug": "western",
                    "language": "eng",
                    "games_count": 812,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                },
                {
                    "id": 5452,
                    "name": "3rd-person",
                    "slug": "3rd-person",
                    "language": "eng",
                    "games_count": 70,
                    "image_background": "https://media.rawg.io/media/screenshots/eb2/eb2b023dd92b40579e61fe28c89c8839.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                },
                {
                    "id": 778173,
                    "image": "https://media.rawg.io/media/screenshots/7b8/7b8895a23e8ca0dbd9e1ba24696579d9.jpg"
                },
                {
                    "id": 778174,
                    "image": "https://media.rawg.io/media/screenshots/b8c/b8cee381079d58b981594ede46a3d6ca.jpg"
                },
                {
                    "id": 778175,
                    "image": "https://media.rawg.io/media/screenshots/fd6/fd6e41d4c30c098158568aef32dfed35.jpg"
                },
                {
                    "id": 778176,
                    "image": "https://media.rawg.io/media/screenshots/2ed/2ed3b2791b3bbed6b98bf362694aeb73.jpg"
                },
                {
                    "id": 778177,
                    "image": "https://media.rawg.io/media/screenshots/857/8573b9f4f06a0c112d6e39cdf3544881.jpg"
                },
                {
                    "id": 778178,
                    "image": "https://media.rawg.io/media/screenshots/985/985e3e1f1d1af1ab0797d43a95d472cc.jpg"
                }
            ]
        },
        {
            "id": 11859,
            "slug": "team-fortress-2",
            "name": "Team Fortress 2",
            "released": "2007-10-10",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg",
            "rating": 3.68,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 935,
                    "percent": 45.26
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 518,
                    "percent": 25.07
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 423,
                    "percent": 20.47
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 190,
                    "percent": 9.2
                }
            ],
            "ratings_count": 2049,
            "reviews_text_count": 15,
            "added": 9152,
            "added_by_status": {
                "yet": 122,
                "owned": 7133,
                "beaten": 560,
                "toplay": 26,
                "dropped": 1189,
                "playing": 122
            },
            "metacritic": 92,
            "playtime": 9,
            "suggestions_count": 529,
            "updated": "2020-07-08T03:57:06",
            "user_game": null,
            "reviews_count": 2066,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324166,
                        "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                    },
                    "released_at": "2007-10-10",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows® 7 (32/64-bit)/Vista/XP<br></li><li><strong>Processor:</strong> 1.7 GHz Processor or better<br></li><li><strong>Memory:</strong> 512 MB RAM<br></li><li><strong>DirectX:</strong> Version 8.1<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 15 GB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows® 7 (32/64-bit)<br></li><li><strong>Processor:</strong> Pentium 4 processor (3.0GHz, or better)<br></li><li><strong>Memory:</strong> 1 GB RAM<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 15 GB available space</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Pentium 4/Athlon XP 1.7 ГГц,512 Мб памяти,3D-ускоритель со 128 Мб памяти,7.5 Гб на винчестере,Интернет-соединение 128 Кб/c",
                        "recommended": "Core 2 Duo/Athlon 64 3 ГГц,1 Гб памяти,3D-ускоритель с 512 Мб памяти,12 Гб на винчестере,Интернет-соединение 512 Кб/c"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70916,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2007-10-10",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> OS X version Leopard 10.5.8 and above<br></li><li><strong>Processor:</strong> 1.7 GHz Processor or better<br></li><li><strong>Memory:</strong> 1 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GeForce 8 or higher, ATI X1600 or higher, Intel HD 3000 or higher<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 15 GB available space</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 49795,
                        "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                    },
                    "released_at": "2007-10-10",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Ubuntu 12.04<br></li><li><strong>Processor:</strong> Dual core from Intel or AMD at 2.8 GHz<br></li><li><strong>Memory:</strong> 1 GB RAM<br></li><li><strong>Graphics:</strong> nVidia GeForce 8600/9600GT, ATI/AMD Radeon HD2600/3600 (Graphic Drivers: nVidia 310, AMD 12.11), OpenGL 2.1<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 15 GB available space<br></li><li><strong>Sound Card:</strong> OpenAL Compatible Sound Card</li></ul>"
                    },
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 13018,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2756,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7242,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 12988,
                    "image_background": "https://media.rawg.io/media/screenshots/f2f/f2f3c93d6153da7aee590f3ab8ccd803.jpg"
                },
                {
                    "id": 9,
                    "name": "Online Co-Op",
                    "slug": "online-co-op",
                    "language": "eng",
                    "games_count": 2647,
                    "image_background": "https://media.rawg.io/media/games/baf/baf9905270314e07e6850cffdb51df41.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6303,
                    "image_background": "https://media.rawg.io/media/screenshots/8f0/8f0b94922ad5e59968852649697b2643.jpg"
                },
                {
                    "id": 79,
                    "name": "Free to Play",
                    "slug": "free-to-play",
                    "language": "eng",
                    "games_count": 3686,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 80,
                    "name": "Tactical",
                    "slug": "tactical",
                    "language": "eng",
                    "games_count": 2267,
                    "image_background": "https://media.rawg.io/media/games/48e/48e63bbddeddbe9ba81942772b156664.jpg"
                },
                {
                    "id": 11669,
                    "name": "stats",
                    "slug": "stats",
                    "language": "eng",
                    "games_count": 3623,
                    "image_background": "https://media.rawg.io/media/games/93e/93ee6101e1c943732f06080dddb0fe4c.jpg"
                },
                {
                    "id": 40852,
                    "name": "Steam Workshop",
                    "slug": "steam-workshop",
                    "language": "eng",
                    "games_count": 1085,
                    "image_background": "https://media.rawg.io/media/games/a44/a444a7628bdb49b24d06a7672f805814.jpg"
                },
                {
                    "id": 62,
                    "name": "Moddable",
                    "slug": "moddable",
                    "language": "eng",
                    "games_count": 540,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 40838,
                    "name": "Includes level editor",
                    "slug": "includes-level-editor",
                    "language": "eng",
                    "games_count": 1348,
                    "image_background": "https://media.rawg.io/media/games/7f0/7f021d4a3577ac9d591a628a431fc2e5.jpg"
                },
                {
                    "id": 40832,
                    "name": "Cross-Platform Multiplayer",
                    "slug": "cross-platform-multiplayer",
                    "language": "eng",
                    "games_count": 1679,
                    "image_background": "https://media.rawg.io/media/games/238/2383a172b4d50a7b44e07980eb7141ea.jpg"
                },
                {
                    "id": 40833,
                    "name": "Captions available",
                    "slug": "captions-available",
                    "language": "eng",
                    "games_count": 1040,
                    "image_background": "https://media.rawg.io/media/games/fee/fee0100afd87b52bfbd33e26689fa26c.jpg"
                },
                {
                    "id": 40837,
                    "name": "In-App Purchases",
                    "slug": "in-app-purchases",
                    "language": "eng",
                    "games_count": 1322,
                    "image_background": "https://media.rawg.io/media/games/2c8/2c89e43515ed12aee51becc3dcfd8e7e.jpg"
                },
                {
                    "id": 11,
                    "name": "Team-Based",
                    "slug": "team-based",
                    "language": "eng",
                    "games_count": 666,
                    "image_background": "https://media.rawg.io/media/games/48e/48e63bbddeddbe9ba81942772b156664.jpg"
                },
                {
                    "id": 40856,
                    "name": "Valve Anti-Cheat enabled",
                    "slug": "valve-anti-cheat-enabled",
                    "language": "eng",
                    "games_count": 104,
                    "image_background": "https://media.rawg.io/media/games/1a1/1a17e9b6286edb7e1f1e510110ccb0c0.jpg"
                },
                {
                    "id": 170,
                    "name": "Competitive",
                    "slug": "competitive",
                    "language": "eng",
                    "games_count": 778,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 125,
                    "name": "Crafting",
                    "slug": "crafting",
                    "language": "eng",
                    "games_count": 1793,
                    "image_background": "https://media.rawg.io/media/games/15c/15c95a4915f88a3e89c821526afe05fc.jpg"
                },
                {
                    "id": 197,
                    "name": "Robots",
                    "slug": "robots",
                    "language": "eng",
                    "games_count": 5176,
                    "image_background": "https://media.rawg.io/media/games/951/951572a3dd1e42544bd39a5d5b42d234.jpg"
                },
                {
                    "id": 40834,
                    "name": "Commentary available",
                    "slug": "commentary-available",
                    "language": "eng",
                    "games_count": 220,
                    "image_background": "https://media.rawg.io/media/games/9e5/9e5b91a6d02e66b8d450a977a59ae123.jpg"
                },
                {
                    "id": 164,
                    "name": "Cartoony",
                    "slug": "cartoony",
                    "language": "eng",
                    "games_count": 1222,
                    "image_background": "https://media.rawg.io/media/screenshots/b54/b5455f679a7e626f32ef8b78392cc327_xVnsIrO.jpg"
                },
                {
                    "id": 179,
                    "name": "Cartoon",
                    "slug": "cartoon",
                    "language": "eng",
                    "games_count": 2189,
                    "image_background": "https://media.rawg.io/media/screenshots/7e8/7e802767c335a7b2b3bf53bbaeee71f8.jpg"
                },
                {
                    "id": 265,
                    "name": "Class-Based",
                    "slug": "class-based",
                    "language": "eng",
                    "games_count": 120,
                    "image_background": "https://media.rawg.io/media/screenshots/fab/fabf971864e0c8d80c5423da74d06800.jpg"
                },
                {
                    "id": 245,
                    "name": "Trading",
                    "slug": "trading",
                    "language": "eng",
                    "games_count": 664,
                    "image_background": "https://media.rawg.io/media/screenshots/42e/42e99339ea2adc30900a64dfb8139e3b.jpg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 97905,
                    "image": "https://media.rawg.io/media/screenshots/596/5968ba06bac8bee0ec7e9d03c970c421.jpg"
                },
                {
                    "id": 97906,
                    "image": "https://media.rawg.io/media/screenshots/94f/94f4eb0b3d1fde7a37ec84f0f66f7f87.jpg"
                },
                {
                    "id": 97907,
                    "image": "https://media.rawg.io/media/screenshots/a0a/a0ad82cad18d0a2466d1d5f12bf8858c.jpg"
                },
                {
                    "id": 97908,
                    "image": "https://media.rawg.io/media/screenshots/a83/a83038d2ec296522ab1b9ab0521b1ec3.jpg"
                },
                {
                    "id": 97909,
                    "image": "https://media.rawg.io/media/screenshots/8d4/8d488a3e65256ec777c8097b0faacc78.jpg"
                },
                {
                    "id": 97910,
                    "image": "https://media.rawg.io/media/screenshots/707/707c7488bd6e35bc74d274a923bc1df2.jpg"
                }
            ]
        },
        {
            "id": 2454,
            "slug": "doom",
            "name": "DOOM (2016)",
            "released": "2016-05-13",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg",
            "rating": 4.4,
            "rating_top": 5,
            "ratings": [
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 1393,
                    "percent": 53.11
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 986,
                    "percent": 37.59
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 189,
                    "percent": 7.21
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 55,
                    "percent": 2.1
                }
            ],
            "ratings_count": 2598,
            "reviews_text_count": 19,
            "added": 9097,
            "added_by_status": {
                "yet": 396,
                "owned": 5660,
                "beaten": 1959,
                "toplay": 356,
                "dropped": 474,
                "playing": 252
            },
            "metacritic": 85,
            "playtime": 11,
            "suggestions_count": 655,
            "updated": "2020-09-14T21:44:34",
            "user_game": null,
            "reviews_count": 2623,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4350,
                        "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                    },
                    "released_at": "2016-05-13",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2016-05-13",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows7,Windows8,Windows10<br></li><li><strong>Processor:</strong> Intel cpu i3<br></li><li><strong>Memory:</strong> 4 GB RAM<br></li><li><strong>Graphics:</strong> GTX 650<br></li><li><strong>Storage:</strong> 2 GB available space<br></li><li><strong>Sound Card:</strong> Realtek</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows7,Windows8,Windows10<br></li><li><strong>Processor:</strong> Intel cpu i5<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> GTX 770<br></li><li><strong>Storage:</strong> 4 GB available space<br></li><li><strong>Sound Card:</strong> Realtek</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "i386-33, 4 Мб",
                        "recommended": "i486-40, 8 Мб"
                    }
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2016-05-13",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2016-05-13",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 355582,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 2571,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 38659,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8639,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    }
                },
                {
                    "id": 8223,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2756,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10037,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7242,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 16,
                    "name": "Horror",
                    "slug": "horror",
                    "language": "eng",
                    "games_count": 21231,
                    "image_background": "https://media.rawg.io/media/games/7c4/7c448374df84b607f67ce9182a3a3ca7.jpg"
                },
                {
                    "id": 49,
                    "name": "Difficult",
                    "slug": "difficult",
                    "language": "eng",
                    "games_count": 8254,
                    "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1546,
                    "image_background": "https://media.rawg.io/media/games/ad2/ad2ffdf80ba993654f31da045bc02456.jpg"
                },
                {
                    "id": 26,
                    "name": "Gore",
                    "slug": "gore",
                    "language": "eng",
                    "games_count": 3752,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 63,
                    "name": "Zombies",
                    "slug": "zombies",
                    "language": "eng",
                    "games_count": 6704,
                    "image_background": "https://media.rawg.io/media/games/f14/f1422eacab98c5f85a5123da4e9d9e89.jpg"
                },
                {
                    "id": 120,
                    "name": "Memes",
                    "slug": "memes",
                    "language": "eng",
                    "games_count": 1063,
                    "image_background": "https://media.rawg.io/media/games/530/5302dd22a190e664531236ca724e8726.jpg"
                },
                {
                    "id": 131,
                    "name": "Fast-Paced",
                    "slug": "fast-paced",
                    "language": "eng",
                    "games_count": 6944,
                    "image_background": "https://media.rawg.io/media/games/3ea/3ea3c9bbd940b6cb7f2139e42d3d443f.jpg"
                },
                {
                    "id": 271,
                    "name": "Remake",
                    "slug": "remake",
                    "language": "eng",
                    "games_count": 1088,
                    "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                },
                {
                    "id": 270,
                    "name": "Blood",
                    "slug": "blood",
                    "language": "eng",
                    "games_count": 1464,
                    "image_background": "https://media.rawg.io/media/games/fbc/fbced95c523be0444ce6d2fa83b1afc0.jpg"
                },
                {
                    "id": 187,
                    "name": "Demons",
                    "slug": "demons",
                    "language": "eng",
                    "games_count": 968,
                    "image_background": "https://media.rawg.io/media/screenshots/a88/a88cb4db66f3515a93229e4be5cdd7bb.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                },
                {
                    "id": 22393,
                    "image": "https://media.rawg.io/media/screenshots/353/353c1e834e7da7d6ceaa6beaff529c29.jpg"
                },
                {
                    "id": 22394,
                    "image": "https://media.rawg.io/media/screenshots/e50/e50f822107b8cc6af57aa21d76524149.jpg"
                },
                {
                    "id": 22398,
                    "image": "https://media.rawg.io/media/screenshots/ae9/ae9e9f7bfe19c63bd16151f81f81a7ed.jpg"
                },
                {
                    "id": 22400,
                    "image": "https://media.rawg.io/media/screenshots/14e/14e33eccb109558b0524761340ff2023.jpg"
                },
                {
                    "id": 22402,
                    "image": "https://media.rawg.io/media/screenshots/45d/45d16955ac9e90141b726684a07db02a.jpg"
                },
                {
                    "id": 22404,
                    "image": "https://media.rawg.io/media/screenshots/b77/b77629938389a41160d3b2a56eaed568.jpg"
                }
            ]
        },
        {
            "id": 3070,
            "slug": "fallout-4",
            "name": "Fallout 4",
            "released": "2015-11-09",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg",
            "rating": 3.77,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 1161,
                    "percent": 48.17
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 653,
                    "percent": 27.1
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 470,
                    "percent": 19.5
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 126,
                    "percent": 5.23
                }
            ],
            "ratings_count": 2391,
            "reviews_text_count": 14,
            "added": 8990,
            "added_by_status": {
                "yet": 407,
                "owned": 5645,
                "beaten": 1508,
                "toplay": 273,
                "dropped": 914,
                "playing": 243
            },
            "metacritic": 84,
            "playtime": 44,
            "suggestions_count": 445,
            "updated": "2020-07-06T04:52:40",
            "user_game": null,
            "reviews_count": 2410,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2015-11-09",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7/8/10 (64-bit OS required)<br></li><li><strong>Processor:</strong> Intel Core i5-2300 2.8 GHz/AMD Phenom II X4 945 3.0 GHz or equivalent<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GTX 550 Ti 2GB/AMD Radeon HD 7870 2GB or equivalent<br></li><li><strong>Storage:</strong> 30 GB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7/8/10 (64-bit OS required)<br></li><li><strong>Processor:</strong> Intel Core i7 4790 3.6 GHz/AMD FX-9590 4.7 GHz or equivalent<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GTX 780 3GB/AMD Radeon R9 290X 4GB or equivalent<br></li><li><strong>Storage:</strong> 30 GB available space</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5840,
                        "image_background": "https://media.rawg.io/media/games/9dd/9ddabb34840ea9227556670606cf8ea3.jpg"
                    },
                    "released_at": "2015-11-09",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2015-11-09",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 35928,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                }
            ],
            "stores": [
                {
                    "id": 3252,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 9047,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 13248,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 9904,
                    "image_background": "https://media.rawg.io/media/games/48c/48cb04ca483be865e3a83119c94e6097.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11667,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 9774,
                    "image_background": "https://media.rawg.io/media/games/b49/b4912b5dbfc7ed8927b65f05b8507f6c.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3671,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10037,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4168,
                    "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3410,
                    "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                },
                {
                    "id": 1,
                    "name": "Survival",
                    "slug": "survival",
                    "language": "eng",
                    "games_count": 4756,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 6,
                    "name": "Exploration",
                    "slug": "exploration",
                    "language": "eng",
                    "games_count": 10134,
                    "image_background": "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                },
                {
                    "id": 150,
                    "name": "Third-Person Shooter",
                    "slug": "third-person-shooter",
                    "language": "eng",
                    "games_count": 1466,
                    "image_background": "https://media.rawg.io/media/games/3cf/3cff89996570cf29a10eb9cd967dcf73.jpg"
                },
                {
                    "id": 97,
                    "name": "Action RPG",
                    "slug": "action-rpg",
                    "language": "eng",
                    "games_count": 3382,
                    "image_background": "https://media.rawg.io/media/games/ee3/ee3e10193aafc3230ba1cae426967d10.jpg"
                },
                {
                    "id": 43,
                    "name": "Post-apocalyptic",
                    "slug": "post-apocalyptic",
                    "language": "eng",
                    "games_count": 1812,
                    "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                },
                {
                    "id": 27994,
                    "image": "https://media.rawg.io/media/screenshots/f55/f5598897e0e418c67521f2213dceb459.jpg"
                },
                {
                    "id": 27996,
                    "image": "https://media.rawg.io/media/screenshots/37c/37ce90b25d84e531743917165115d24c.jpg"
                },
                {
                    "id": 28000,
                    "image": "https://media.rawg.io/media/screenshots/fd3/fd3a97519e6d1b73f429f6bfcfb3bcf5.jpg"
                },
                {
                    "id": 28002,
                    "image": "https://media.rawg.io/media/screenshots/069/0691b4c1b839e55531d8c3206cd83dd7.jpg"
                },
                {
                    "id": 28004,
                    "image": "https://media.rawg.io/media/screenshots/cc0/cc0b3e29b579faae8d8585fd9ecff142.jpg"
                },
                {
                    "id": 28006,
                    "image": "https://media.rawg.io/media/screenshots/99c/99c81029aeace339293753186246099f.jpg"
                }
            ]
        },
        {
            "id": 3939,
            "slug": "payday-2",
            "name": "PAYDAY 2",
            "released": "2013-08-13",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg",
            "rating": 3.5,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 743,
                    "percent": 51.1
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 412,
                    "percent": 28.34
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 154,
                    "percent": 10.59
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 145,
                    "percent": 9.97
                }
            ],
            "ratings_count": 1445,
            "reviews_text_count": 8,
            "added": 8923,
            "added_by_status": {
                "yet": 348,
                "owned": 7106,
                "beaten": 480,
                "toplay": 63,
                "dropped": 845,
                "playing": 81
            },
            "metacritic": 79,
            "playtime": 9,
            "suggestions_count": 447,
            "updated": "2019-11-05T16:34:08",
            "user_game": null,
            "reviews_count": 1454,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 49795,
                        "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                    },
                    "released_at": "2013-08-13",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324167,
                        "image_background": "https://media.rawg.io/media/games/736/73619bd336c894d6941d926bfd563946.jpg"
                    },
                    "released_at": "2013-08-13",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong>Windows 7<br>\t</li><li><strong>Processor:</strong>2 GHz Intel Dual Core Processor<br>\t</li><li><strong>Memory:</strong>4 GB RAM<br>\t</li><li><strong>Graphics:</strong>Nvidia &amp; AMD (512MB VRAM)<br>\t</li><li><strong>DirectX®:</strong>9.0c<br>\t</li><li><strong>Hard Drive:</strong>31 GB HD space <br>\t</li><li><strong>Sound:</strong>DirectX 9.0c compatible</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong>Windows 10<br>\t</li><li><strong>Processor:</strong>2.3 GHz Intel Quad Core Processor<br>\t</li><li><strong>Memory:</strong>8 GB RAM<br>\t</li><li><strong>Graphics:</strong>Nvidia &amp; AMD (1GB VRAM)<br>\t</li><li><strong>DirectX®:</strong>9.0c<br>\t</li><li><strong>Hard Drive:</strong>45 GB HD space<br>\t</li><li><strong>Sound:</strong>DirectX 9.0c compatible</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2013-08-13",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 37684,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 4258,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 10780,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 27939,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8639,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    }
                },
                {
                    "id": 34027,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21531,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10032,
                    "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3128,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2756,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 12473,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7484,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 12988,
                    "image_background": "https://media.rawg.io/media/screenshots/f2f/f2f3c93d6153da7aee590f3ab8ccd803.jpg"
                },
                {
                    "id": 9,
                    "name": "Online Co-Op",
                    "slug": "online-co-op",
                    "language": "eng",
                    "games_count": 2647,
                    "image_background": "https://media.rawg.io/media/games/baf/baf9905270314e07e6850cffdb51df41.jpg"
                },
                {
                    "id": 15,
                    "name": "Stealth",
                    "slug": "stealth",
                    "language": "eng",
                    "games_count": 3768,
                    "image_background": "https://media.rawg.io/media/games/364/3642d850efb217c58feab80b8affaa89.jpg"
                },
                {
                    "id": 80,
                    "name": "Tactical",
                    "slug": "tactical",
                    "language": "eng",
                    "games_count": 2267,
                    "image_background": "https://media.rawg.io/media/games/48e/48e63bbddeddbe9ba81942772b156664.jpg"
                },
                {
                    "id": 40837,
                    "name": "In-App Purchases",
                    "slug": "in-app-purchases",
                    "language": "eng",
                    "games_count": 1322,
                    "image_background": "https://media.rawg.io/media/games/2c8/2c89e43515ed12aee51becc3dcfd8e7e.jpg"
                },
                {
                    "id": 11,
                    "name": "Team-Based",
                    "slug": "team-based",
                    "language": "eng",
                    "games_count": 666,
                    "image_background": "https://media.rawg.io/media/games/48e/48e63bbddeddbe9ba81942772b156664.jpg"
                },
                {
                    "id": 144,
                    "name": "Crime",
                    "slug": "crime",
                    "language": "eng",
                    "games_count": 1778,
                    "image_background": "https://media.rawg.io/media/games/fbb/fbbd9fe21317bde9134114e2b1306069.jpg"
                },
                {
                    "id": 216,
                    "name": "Heist",
                    "slug": "heist",
                    "language": "eng",
                    "games_count": 251,
                    "image_background": "https://media.rawg.io/media/games/f6b/f6bed028b02369d4cab548f4f9337e81.jpg"
                },
                {
                    "id": 171,
                    "name": "PvE",
                    "slug": "pve",
                    "language": "eng",
                    "games_count": 886,
                    "image_background": "https://media.rawg.io/media/screenshots/2d8/2d8d9d70988fdaab42886dda974d31a6.jpg"
                },
                {
                    "id": 274,
                    "name": "Gun Customization",
                    "slug": "gun-customization",
                    "language": "eng",
                    "games_count": 121,
                    "image_background": "https://media.rawg.io/media/screenshots/65e/65eaac98b80c4e39cee959ff266a24c2.jpg"
                }
            ],
            "esrb_rating": {
                "id": 5,
                "name": "Adults Only",
                "slug": "adults-only"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
                },
                {
                    "id": 74194,
                    "image": "https://media.rawg.io/media/screenshots/c38/c38f5aa479eebab20cedcdae370e6e18.jpg"
                },
                {
                    "id": 74195,
                    "image": "https://media.rawg.io/media/screenshots/442/442be5656b314e3289ecd1486b5282f1.jpg"
                },
                {
                    "id": 74196,
                    "image": "https://media.rawg.io/media/screenshots/c2c/c2ccfeaeda357f932d1899a91f298850.jpg"
                },
                {
                    "id": 74197,
                    "image": "https://media.rawg.io/media/screenshots/a18/a18da938def6ce6e5b571f1c20272ab0.jpg"
                },
                {
                    "id": 74198,
                    "image": "https://media.rawg.io/media/screenshots/a5d/a5da0d01195f01cdedec974d52892128.jpg"
                },
                {
                    "id": 74199,
                    "image": "https://media.rawg.io/media/screenshots/4ee/4ee5c3c8b850ab4ba8e04b9f5d5ab060.jpg"
                }
            ]
        },
        {
            "id": 4459,
            "slug": "grand-theft-auto-iv",
            "name": "Grand Theft Auto IV",
            "released": "2008-04-29",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg",
            "rating": 4.24,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 935,
                    "percent": 45.34
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 858,
                    "percent": 41.61
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 223,
                    "percent": 10.81
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 46,
                    "percent": 2.23
                }
            ],
            "ratings_count": 2049,
            "reviews_text_count": 8,
            "added": 8854,
            "added_by_status": {
                "yet": 229,
                "owned": 5843,
                "beaten": 1866,
                "toplay": 146,
                "dropped": 696,
                "playing": 74
            },
            "metacritic": 95,
            "playtime": 9,
            "suggestions_count": 497,
            "updated": "2020-08-03T02:25:58",
            "user_game": null,
            "reviews_count": 2062,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2709,
                        "image_background": "https://media.rawg.io/media/games/c6b/c6bfece1daf8d06bc0a60632ac78e5bf.jpg"
                    },
                    "released_at": "2008-04-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3621,
                        "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                    },
                    "released_at": "2008-04-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4487,
                        "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                    },
                    "released_at": "2008-04-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 324166,
                        "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                    },
                    "released_at": "2008-04-29",
                    "requirements_en": {
                        "minimum": "<ul class=\"bb_ul\"><li><strong>OS:</strong> Windows Vista - Service Pack 1 / Windows XP - Service Pack 3                    <br>\t\t\t\t\t</li><li><strong>Processor:</strong> Intel Core 2 Duo 1.8GHz, AMD Athlon X2 64 2.4GHz                    <br>\t\t\t\t\t</li><li><strong>Memory:</strong> 1.5GB XP / 1.5GB Vista                    <br>\t\t\t\t\t</li><li><strong>Graphics:</strong> 256MB Nvidia 7900 / 256MB ATI X1900                    <br>\t\t\t\t\t</li><li><strong>DirectX Version:</strong> DirectX 9.0c Compliant Card                     <br>\t\t\t\t\t</li><li><strong>Hard Drive:</strong> 16GB of Hard Disc Space                     <br>\t\t\t\t\t</li><li><strong>Sound Card:</strong> 5.1 Channel Audio Card                     <br>\t\t\t\t\t</li><li><strong>Other Requirements:</strong> Initial activation requires internet connection; Online play requires log-in to Games For Windows - Live and Rockstar Games Social Club (13+ to register); software installations required including Adobe Flash, DirectX, Microsoft’s .NET Framework 3.0, Games For Windows - LIVE, and Internet Explorer.                    </li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Core 2 Duo/Athlon X2 64 2 ГГц, 1 Гб памяти, GeForce 7900/Radeon X1900,17 Гб на винчестере,XP SP3/Vista SP1,интернет-соединение",
                        "recommended": "Core 2 Quad/Phenom X4 2.5 ГГц,2 Гб памяти, GeForce GTX 280/Radeon HD 4870,17 Гб на винчестере,XP SP3/Vista SP1,интернет-соединение"
                    }
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 115929,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 84693,
                    "image_background": "https://media.rawg.io/media/games/d69/d69810315bd7e226ea2d21f9156af629.jpg"
                }
            ],
            "stores": [
                {
                    "id": 4787,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7522,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 465944,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4077,
                        "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
                    }
                },
                {
                    "id": 17290,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 50877,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    }
                },
                {
                    "id": 42864,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 112323,
                    "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25051,
                    "image_background": "https://media.rawg.io/media/games/da1/da1b267764d77221f07a4386b6548e5a.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13075,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6595,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3671,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2756,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4168,
                    "image_background": "https://media.rawg.io/media/games/16b/16b1b7b36e2042d1128d5a3e852b3b2f.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7242,
                    "image_background": "https://media.rawg.io/media/games/f87/f87457e8347484033cb34cde6101d08d.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 12988,
                    "image_background": "https://media.rawg.io/media/screenshots/f2f/f2f3c93d6153da7aee590f3ab8ccd803.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1546,
                    "image_background": "https://media.rawg.io/media/games/ad2/ad2ffdf80ba993654f31da045bc02456.jpg"
                },
                {
                    "id": 26,
                    "name": "Gore",
                    "slug": "gore",
                    "language": "eng",
                    "games_count": 3752,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3410,
                    "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                },
                {
                    "id": 150,
                    "name": "Third-Person Shooter",
                    "slug": "third-person-shooter",
                    "language": "eng",
                    "games_count": 1466,
                    "image_background": "https://media.rawg.io/media/games/3cf/3cff89996570cf29a10eb9cd967dcf73.jpg"
                },
                {
                    "id": 62,
                    "name": "Moddable",
                    "slug": "moddable",
                    "language": "eng",
                    "games_count": 540,
                    "image_background": "https://media.rawg.io/media/games/be9/be9cf02720c9326e11d0fda14518554f.jpg"
                },
                {
                    "id": 144,
                    "name": "Crime",
                    "slug": "crime",
                    "language": "eng",
                    "games_count": 1778,
                    "image_background": "https://media.rawg.io/media/games/fbb/fbbd9fe21317bde9134114e2b1306069.jpg"
                },
                {
                    "id": 148,
                    "name": "Dark Humor",
                    "slug": "dark-humor",
                    "language": "eng",
                    "games_count": 1514,
                    "image_background": "https://media.rawg.io/media/screenshots/7ab/7ab68441389f60523d2f6cb75c6393f2.jpg"
                },
                {
                    "id": 62348,
                    "name": "first person mod",
                    "slug": "first-person-mod",
                    "language": "eng",
                    "games_count": 15,
                    "image_background": "https://media.rawg.io/media/games/e3d/e3ddc524c6292a435d01d97cc5f42ea7.jpg"
                },
                {
                    "id": 153,
                    "name": "Satire",
                    "slug": "satire",
                    "language": "eng",
                    "games_count": 732,
                    "image_background": "https://media.rawg.io/media/screenshots/239/2395df3a388d30d09f5552a203ed8a7d.jpg"
                },
                {
                    "id": 321,
                    "name": "Bowling",
                    "slug": "bowling",
                    "language": "eng",
                    "games_count": 100,
                    "image_background": "https://media.rawg.io/media/screenshots/b50/b505ba33002adcc00a9357bbc948859f.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 139042,
                    "image": "https://media.rawg.io/media/screenshots/07f/07f7cf80741ff306e4eca982c3e64ac8.jpg"
                },
                {
                    "id": 139043,
                    "image": "https://media.rawg.io/media/screenshots/fef/fefd51ec13aa33acbd796ef79bcef7cb.jpg"
                },
                {
                    "id": 139044,
                    "image": "https://media.rawg.io/media/screenshots/b78/b78ffd258d5793be704c380e572748bc.jpg"
                },
                {
                    "id": 139045,
                    "image": "https://media.rawg.io/media/screenshots/17c/17c85ab9dfc4fda8e1e5ba72932ef2bf.jpg"
                },
                {
                    "id": 139046,
                    "image": "https://media.rawg.io/media/screenshots/a12/a12ca99cc74c1e7eba7100b0891dd1e0.jpg"
                },
                {
                    "id": 139047,
                    "image": "https://media.rawg.io/media/screenshots/b25/b254f9729ae3f36a9ccffccaa01d5cf6.jpg"
                }
            ]
        }
    ],
    "seo_title": "All Games",
    "seo_description": "",
    "seo_keywords": "",
    "seo_h1": "All Games",
    "noindex": false,
    "nofollow": false,
    "description": "",
    "filters": {
        "years": [
            {
                "from": 2020,
                "to": 2021,
                "filter": "2020-01-01,2021-12-31",
                "decade": 2020,
                "years": [
                    {
                        "year": 2021,
                        "count": 60548,
                        "nofollow": false
                    },
                    {
                        "year": 2020,
                        "count": 132491,
                        "nofollow": false
                    }
                ],
                "nofollow": true,
                "count": 193039
            },
            {
                "from": 2010,
                "to": 2019,
                "filter": "2010-01-01,2019-12-31",
                "decade": 2010,
                "years": [
                    {
                        "year": 2019,
                        "count": 79439,
                        "nofollow": false
                    },
                    {
                        "year": 2018,
                        "count": 71327,
                        "nofollow": false
                    },
                    {
                        "year": 2017,
                        "count": 56335,
                        "nofollow": true
                    },
                    {
                        "year": 2016,
                        "count": 41169,
                        "nofollow": true
                    },
                    {
                        "year": 2015,
                        "count": 26307,
                        "nofollow": true
                    },
                    {
                        "year": 2014,
                        "count": 15513,
                        "nofollow": true
                    },
                    {
                        "year": 2013,
                        "count": 6255,
                        "nofollow": true
                    },
                    {
                        "year": 2012,
                        "count": 5304,
                        "nofollow": true
                    },
                    {
                        "year": 2011,
                        "count": 4232,
                        "nofollow": true
                    },
                    {
                        "year": 2010,
                        "count": 3808,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 309689
            },
            {
                "from": 2000,
                "to": 2009,
                "filter": "2000-01-01,2009-12-31",
                "decade": 2000,
                "years": [
                    {
                        "year": 2009,
                        "count": 3029,
                        "nofollow": true
                    },
                    {
                        "year": 2008,
                        "count": 1949,
                        "nofollow": true
                    },
                    {
                        "year": 2007,
                        "count": 1488,
                        "nofollow": true
                    },
                    {
                        "year": 2006,
                        "count": 1210,
                        "nofollow": true
                    },
                    {
                        "year": 2005,
                        "count": 1092,
                        "nofollow": true
                    },
                    {
                        "year": 2004,
                        "count": 1098,
                        "nofollow": true
                    },
                    {
                        "year": 2003,
                        "count": 1079,
                        "nofollow": true
                    },
                    {
                        "year": 2002,
                        "count": 943,
                        "nofollow": true
                    },
                    {
                        "year": 2001,
                        "count": 1063,
                        "nofollow": true
                    },
                    {
                        "year": 2000,
                        "count": 940,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 13891
            },
            {
                "from": 1990,
                "to": 1999,
                "filter": "1990-01-01,1999-12-31",
                "decade": 1990,
                "years": [
                    {
                        "year": 1999,
                        "count": 728,
                        "nofollow": true
                    },
                    {
                        "year": 1998,
                        "count": 667,
                        "nofollow": true
                    },
                    {
                        "year": 1997,
                        "count": 824,
                        "nofollow": true
                    },
                    {
                        "year": 1996,
                        "count": 695,
                        "nofollow": true
                    },
                    {
                        "year": 1995,
                        "count": 809,
                        "nofollow": true
                    },
                    {
                        "year": 1994,
                        "count": 755,
                        "nofollow": true
                    },
                    {
                        "year": 1993,
                        "count": 707,
                        "nofollow": true
                    },
                    {
                        "year": 1992,
                        "count": 613,
                        "nofollow": true
                    },
                    {
                        "year": 1991,
                        "count": 535,
                        "nofollow": true
                    },
                    {
                        "year": 1990,
                        "count": 507,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 6840
            },
            {
                "from": 1980,
                "to": 1989,
                "filter": "1980-01-01,1989-12-31",
                "decade": 1980,
                "years": [
                    {
                        "year": 1989,
                        "count": 400,
                        "nofollow": true
                    },
                    {
                        "year": 1988,
                        "count": 302,
                        "nofollow": true
                    },
                    {
                        "year": 1987,
                        "count": 326,
                        "nofollow": true
                    },
                    {
                        "year": 1986,
                        "count": 244,
                        "nofollow": true
                    },
                    {
                        "year": 1985,
                        "count": 221,
                        "nofollow": true
                    },
                    {
                        "year": 1984,
                        "count": 181,
                        "nofollow": true
                    },
                    {
                        "year": 1983,
                        "count": 202,
                        "nofollow": true
                    },
                    {
                        "year": 1982,
                        "count": 143,
                        "nofollow": true
                    },
                    {
                        "year": 1981,
                        "count": 64,
                        "nofollow": true
                    },
                    {
                        "year": 1980,
                        "count": 34,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 2117
            },
            {
                "from": 1970,
                "to": 1979,
                "filter": "1970-01-01,1979-12-31",
                "decade": 1970,
                "years": [
                    {
                        "year": 1979,
                        "count": 15,
                        "nofollow": true
                    },
                    {
                        "year": 1978,
                        "count": 17,
                        "nofollow": true
                    },
                    {
                        "year": 1977,
                        "count": 12,
                        "nofollow": true
                    },
                    {
                        "year": 1976,
                        "count": 7,
                        "nofollow": true
                    },
                    {
                        "year": 1975,
                        "count": 2,
                        "nofollow": true
                    },
                    {
                        "year": 1974,
                        "count": 1,
                        "nofollow": true
                    },
                    {
                        "year": 1973,
                        "count": 1,
                        "nofollow": true
                    },
                    {
                        "year": 1972,
                        "count": 2,
                        "nofollow": true
                    },
                    {
                        "year": 1971,
                        "count": 5,
                        "nofollow": true
                    },
                    {
                        "year": 1970,
                        "count": 1,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 63
            },
            {
                "from": 1960,
                "to": 1969,
                "filter": "1960-01-01,1969-12-31",
                "decade": 1960,
                "years": [
                    {
                        "year": 1962,
                        "count": 1,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 1
            },
            {
                "from": 1950,
                "to": 1959,
                "filter": "1950-01-01,1959-12-31",
                "decade": 1950,
                "years": [
                    {
                        "year": 1957,
                        "count": 1,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 1
            }
        ]
    },
    "nofollow_collections": [
        "stores"
    ]
}
""".trimIndent()

@Language("json")
internal val gameDetailResponse = """
{
    "id": 1,
    "slug": "dgeneration-hd",
    "name": "D/Generation HD",
    "name_original": "D/Generation HD",
    "description": "The year is 2021, and Genoq has become a leading corporation in bio-medical research. However the tower, some 90 stories high, is not all that it seems. Somewhere within the tower, highly illegal bio-weapons research has been conducted in secret. June 26th, disaster strikes and the lethal organic weapons have escaped and threaten not only the staff members stranded in the tower, but the world itself. <br/><br/>You arrive on the 80th floor with an urgent package addressed to Derrida, the lead scientist at Genoq working on the bio-weapons research. Set back from your goal, you must climb the tower, assisting those in need or focusing solely on your task at hand, and stopping the virus from escaping the tower and threatening all life on the planet.<br/><br/>Will you help the stranded survivors or hinder them? Can you deliver the package to Derrida in time? Can you prevent the impending catastrophe and escape with your life?<br/><br/>Key Features<br/><ul><li> New high res graphics<br/></li><li> New music by Mark 'TDK' Knight<br/></li><li> New control menu<br/></li><li> Can save at any point in the game<br/></li><li> Leaderboards<br/></li><li> Achievements<br/></li><li> Same great gameplay</li></ul>",
    "metacritic": null,
    "metacritic_platforms": [],
    "released": "2015-10-23",
    "tba": false,
    "updated": "2019-09-17T11:58:57",
    "background_image": "https://media.rawg.io/media/screenshots/5c4/5c41cb3b0d15ef0974f930898cedbc6c.jpg",
    "background_image_additional": "https://media.rawg.io/media/screenshots/8bd/8bd3afed5e0bb62ea03899f9807d1b38.jpg",
    "website": "http://dgeneration.net",
    "rating": 0.0,
    "rating_top": 0,
    "ratings": [
        {
            "id": 1,
            "title": "skip",
            "count": 3,
            "percent": 75.0
        },
        {
            "id": 5,
            "title": "exceptional",
            "count": 1,
            "percent": 25.0
        }
    ],
    "reactions": {
        "13": 2
    },
    "added": 97,
    "added_by_status": {
        "yet": 4,
        "owned": 89,
        "beaten": 2,
        "toplay": 2
    },
    "playtime": 1,
    "screenshots_count": 28,
    "movies_count": 0,
    "creators_count": 0,
    "achievements_count": 80,
    "parent_achievements_count": 49,
    "reddit_url": "",
    "reddit_name": "",
    "reddit_description": "",
    "reddit_logo": "",
    "reddit_count": 0,
    "twitch_count": 11,
    "youtube_count": 1000000,
    "reviews_text_count": 2,
    "ratings_count": 2,
    "suggestions_count": 284,
    "alternative_names": [],
    "metacritic_url": "",
    "parents_count": 0,
    "additions_count": 0,
    "game_series_count": 0,
    "user_game": null,
    "reviews_count": 4,
    "community_rating": 0,
    "saturated_color": "0f0f0f",
    "dominant_color": "0f0f0f",
    "parent_platforms": [
        {
            "platform": {
                "id": 1,
                "name": "PC",
                "slug": "pc"
            }
        },
        {
            "platform": {
                "id": 2,
                "name": "PlayStation",
                "slug": "playstation"
            }
        },
        {
            "platform": {
                "id": 3,
                "name": "Xbox",
                "slug": "xbox"
            }
        },
        {
            "platform": {
                "id": 5,
                "name": "Apple Macintosh",
                "slug": "mac"
            }
        },
        {
            "platform": {
                "id": 7,
                "name": "Nintendo",
                "slug": "nintendo"
            }
        }
    ],
    "platforms": [
        {
            "platform": {
                "id": 1,
                "name": "Xbox One",
                "slug": "xbox-one",
                "image": null,
                "year_end": null,
                "year_start": null,
                "games_count": 4487,
                "image_background": "https://media.rawg.io/media/games/490/49016e06ae2103881ff6373248843069.jpg"
            },
            "released_at": "2016-02-12",
            "requirements": {}
        },
        {
            "platform": {
                "id": 18,
                "name": "PlayStation 4",
                "slug": "playstation4",
                "image": null,
                "year_end": null,
                "year_start": null,
                "games_count": 5845,
                "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
            },
            "released_at": null,
            "requirements": {}
        },
        {
            "platform": {
                "id": 7,
                "name": "Nintendo Switch",
                "slug": "nintendo-switch",
                "image": null,
                "year_end": null,
                "year_start": null,
                "games_count": 4352,
                "image_background": "https://media.rawg.io/media/games/4cf/4cfc6b7f1850590a4634b08bfab308ab.jpg"
            },
            "released_at": "2018-03-27",
            "requirements": {}
        },
        {
            "platform": {
                "id": 4,
                "name": "PC",
                "slug": "pc",
                "image": null,
                "year_end": null,
                "year_start": null,
                "games_count": 324172,
                "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
            },
            "released_at": "2015-10-23",
            "requirements": {
                "minimum": "Minimum:\nMemory: 4 GB RAM\nDirectX: Version 11",
                "recommended": "Recommended:\nMemory: 8 GB RAM\nDirectX: Version 11"
            }
        },
        {
            "platform": {
                "id": 5,
                "name": "macOS",
                "slug": "macos",
                "image": null,
                "year_end": null,
                "year_start": null,
                "games_count": 70915,
                "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
            },
            "released_at": "2015-10-23",
            "requirements": {
                "minimum": "Minimum:\nMemory: 4 GB RAM",
                "recommended": "Recommended:\nMemory: 8 GB RAM\nGraphics: Nvidia or AMD graphics"
            }
        }
    ],
    "stores": [
        {
            "id": 1,
            "url": "",
            "store": {
                "id": 2,
                "name": "Xbox Store",
                "slug": "xbox-store",
                "domain": "microsoft.com",
                "games_count": 4077,
                "image_background": "https://media.rawg.io/media/games/511/5118aff5091cb3efec399c808f8c598f.jpg"
            }
        },
        {
            "id": 2808,
            "url": "",
            "store": {
                "id": 3,
                "name": "PlayStation Store",
                "slug": "playstation-store",
                "domain": "store.playstation.com",
                "games_count": 7522,
                "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
            }
        },
        {
            "id": 19827,
            "url": "",
            "store": {
                "id": 1,
                "name": "Steam",
                "slug": "steam",
                "domain": "store.steampowered.com",
                "games_count": 50876,
                "image_background": "https://media.rawg.io/media/games/328/3283617cb7d75d67257fc58339188742.jpg"
            }
        },
        {
            "id": 46741,
            "url": "",
            "store": {
                "id": 6,
                "name": "Nintendo Store",
                "slug": "nintendo",
                "domain": "nintendo.com",
                "games_count": 8639,
                "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
            }
        }
    ],
    "developers": [
        {
            "id": 10183,
            "name": "West Coast Software",
            "slug": "west-coast-software",
            "games_count": 3,
            "image_background": "https://media.rawg.io/media/screenshots/5c4/5c41cb3b0d15ef0974f930898cedbc6c.jpg"
        }
    ],
    "genres": [
        {
            "id": 3,
            "name": "Adventure",
            "slug": "adventure",
            "games_count": 84694,
            "image_background": "https://media.rawg.io/media/games/709/709bf81f874ce5d25d625b37b014cb63.jpg"
        },
        {
            "id": 7,
            "name": "Puzzle",
            "slug": "puzzle",
            "games_count": 64158,
            "image_background": "https://media.rawg.io/media/games/df2/df20fd77db56ae7b0a26a7ff4baa9ccc.jpg"
        }
    ],
    "tags": [
        {
            "id": 31,
            "name": "Singleplayer",
            "slug": "singleplayer",
            "language": "eng",
            "games_count": 112323,
            "image_background": "https://media.rawg.io/media/games/6cd/6cd653e0aaef5ff8bbd295bf4bcb12eb.jpg"
        },
        {
            "id": 40847,
            "name": "Steam Achievements",
            "slug": "steam-achievements",
            "language": "eng",
            "games_count": 21531,
            "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
        },
        {
            "id": 40836,
            "name": "Full controller support",
            "slug": "full-controller-support",
            "language": "eng",
            "games_count": 10032,
            "image_background": "https://media.rawg.io/media/games/ed5/ed5b7d01dd68fd8d598c91ad61f153af.jpg"
        },
        {
            "id": 40850,
            "name": "Steam Leaderboards",
            "slug": "steam-leaderboards",
            "language": "eng",
            "games_count": 4627,
            "image_background": "https://media.rawg.io/media/games/03d/03d17d237f9541b67a13f9425ced4ca4.jpg"
        },
        {
            "id": 74,
            "name": "Retro",
            "slug": "retro",
            "language": "eng",
            "games_count": 20963,
            "image_background": "https://media.rawg.io/media/games/6d3/6d33014a4ed48a19c30a77ead5a0f62e.jpg"
        }
    ],
    "publishers": [
        {
            "id": 8169,
            "name": "West Coast Software",
            "slug": "west-coast-software",
            "games_count": 4,
            "image_background": "https://media.rawg.io/media/screenshots/5c4/5c41cb3b0d15ef0974f930898cedbc6c.jpg"
        }
    ],
    "esrb_rating": {
        "id": 2,
        "name": "Everyone 10+",
        "slug": "everyone-10-plus"
    },
    "clip": null,
    "description_raw": "The year is 2021, and Genoq has become a leading corporation in bio-medical research. However the tower, some 90 stories high, is not all that it seems. Somewhere within the tower, highly illegal bio-weapons research has been conducted in secret. June 26th, disaster strikes and the lethal organic weapons have escaped and threaten not only the staff members stranded in the tower, but the world itself.\nYou arrive on the 80th floor with an urgent package addressed to Derrida, the lead scientist at Genoq working on the bio-weapons research. Set back from your goal, you must climb the tower, assisting those in need or focusing solely on your task at hand, and stopping the virus from escaping the tower and threatening all life on the planet.\nWill you help the stranded survivors or hinder them? Can you deliver the package to Derrida in time? Can you prevent the impending catastrophe and escape with your life?\nKey Features\nNew high res graphics\nNew music by Mark 'TDK' Knight\nNew control menu\nCan save at any point in the game\nLeaderboards\nAchievements\nSame great gameplay"
}
""".trimIndent()

@Language("json")
internal val gameListResponse2 = """
{
    "count": 564690,
    "next": "https://api.rawg.io/api/games?key=d4377600d5454d1d80a3e2b004c4f69c&page=30",
    "previous": "https://api.rawg.io/api/games?key=d4377600d5454d1d80a3e2b004c4f69c&page=28",
    "results": [
        {
            "id": 19309,
            "slug": "plants-vs-zombies-goty-edition",
            "name": "Plants vs. Zombies GOTY Edition",
            "released": "2010-08-10",
            "tba": false,
            "background_image": "https://media.rawg.io/media/screenshots/e9f/e9f8ec3156f19f61071a871cc2ef4f1f.jpg",
            "rating": 4.3,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 242,
                    "percent": 52.27
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 187,
                    "percent": 40.39
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 27,
                    "percent": 5.83
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 7,
                    "percent": 1.51
                }
            ],
            "ratings_count": 461,
            "reviews_text_count": 1,
            "added": 2497,
            "added_by_status": {
                "yet": 27,
                "owned": 1917,
                "beaten": 442,
                "toplay": 13,
                "dropped": 82,
                "playing": 16
            },
            "metacritic": 87,
            "playtime": 5,
            "suggestions_count": 254,
            "updated": "2020-10-31T19:07:06",
            "user_game": null,
            "reviews_count": 463,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 3,
                        "name": "iOS",
                        "slug": "ios",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70857,
                        "image_background": "https://media.rawg.io/media/games/be0/be084b850302abe81675bc4ffc08a0d0.jpg"
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": {
                        "minimum": "<ul class=\"bb_ul\"><li><strong>OS:</strong> Mac OS X 10.5.8-10.6.x<br>\t                    </li><li><strong>Processor:</strong> Intel Core Duo 1.66GHz+<br>\t                    </li><li><strong>Memory:</strong> 1GB of RAM<br>\t                    </li><li><strong>Graphics:</strong> 64MB of video memory, 16-bit or 32-bit color quality<br>\t                    </li><li><strong>Hard Drive:</strong> 50+MB of free hard drive space<br>\t                    </li><li><strong>Sound:</strong> Standard audio<br>                    </li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": {
                        "minimum": "<ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP/Vista/7<br>\t                    </li><li><strong>Processor:</strong> 1.2GHz+ processor<br>\t                    </li><li><strong>Memory:</strong> 1GB of RAM<br>\t                    </li><li><strong>Graphics:</strong> 128MB of video memory, 16-bit or 32-bit color quality<br>\t                    </li><li><strong>DirectX:</strong> DirectX 8 or later<br>\t                    </li><li><strong>Hard Drive:</strong> 65+MB of free hard drive space<br>\t                    </li><li><strong>Sound:</strong> DirectX-compatible sound<br>                    </li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 9,
                        "name": "Nintendo DS",
                        "slug": "nintendo-ds",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2308,
                        "image_background": "https://media.rawg.io/media/games/9f7/9f750cb69a31a42648f45e3681abed3a.jpg"
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 13,
                        "name": "Nintendo DSi",
                        "slug": "nintendo-dsi",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 28,
                        "image_background": null
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2718,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3625,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 19,
                        "name": "PS Vita",
                        "slug": "ps-vita",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 1938,
                        "image_background": "https://media.rawg.io/media/games/6d3/6d33014a4ed48a19c30a77ead5a0f62e.jpg"
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37877,
                        "image_background": "https://media.rawg.io/media/games/283/283e7e600366b0da7021883d27159b27.jpg"
                    },
                    "released_at": "2010-08-10",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "iOS",
                        "slug": "ios"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 10,
                    "name": "Strategy",
                    "slug": "strategy",
                    "games_count": 37479,
                    "image_background": "https://media.rawg.io/media/games/d03/d030347839f74454afcd1008248b08ae.jpg"
                }
            ],
            "stores": [
                {
                    "id": 394293,
                    "store": {
                        "id": 8,
                        "name": "Google Play",
                        "slug": "google-play",
                        "domain": "play.google.com",
                        "games_count": 16323,
                        "image_background": "https://media.rawg.io/media/games/e04/e04963f3ac4c4fa83a1dc0b9231e50db.jpg"
                    }
                },
                {
                    "id": 394292,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 69259,
                        "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                    }
                },
                {
                    "id": 394294,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    }
                },
                {
                    "id": 21591,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3138,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 45,
                    "name": "2D",
                    "slug": "2d",
                    "language": "eng",
                    "games_count": 111700,
                    "image_background": "https://media.rawg.io/media/screenshots/c97/c97b943741f5fbc936fe054d9d58851d.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 13427,
                    "image_background": "https://media.rawg.io/media/screenshots/88b/88b5f27f07d6ca2f8a3cd0b36e03a670.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1559,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 1,
                    "name": "Survival",
                    "slug": "survival",
                    "language": "eng",
                    "games_count": 4862,
                    "image_background": "https://media.rawg.io/media/games/9c4/9c47f320eb73c9a02d462e12f6206b26.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6483,
                    "image_background": "https://media.rawg.io/media/games/af7/af7a831001c5c32c46e950cc883b8cb7.jpg"
                },
                {
                    "id": 80,
                    "name": "Tactical",
                    "slug": "tactical",
                    "language": "eng",
                    "games_count": 2348,
                    "image_background": "https://media.rawg.io/media/games/7ac/7aca7ccf0e70cd0974cb899ab9e5158e.jpg"
                },
                {
                    "id": 63,
                    "name": "Zombies",
                    "slug": "zombies",
                    "language": "eng",
                    "games_count": 6837,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 43,
                    "name": "Post-apocalyptic",
                    "slug": "post-apocalyptic",
                    "language": "eng",
                    "games_count": 1869,
                    "image_background": "https://media.rawg.io/media/games/c73/c73c4ffebfe968ba0982a56c2b5020ef.jpg"
                },
                {
                    "id": 107,
                    "name": "Family Friendly",
                    "slug": "family-friendly",
                    "language": "eng",
                    "games_count": 2202,
                    "image_background": "https://media.rawg.io/media/games/f15/f15e1dbda32b588a981bbc6b222a4b4c.jpg"
                },
                {
                    "id": 88,
                    "name": "Cute",
                    "slug": "cute",
                    "language": "eng",
                    "games_count": 15386,
                    "image_background": "https://media.rawg.io/media/games/416/4164ca654a339af5be8e63cc9c480c70.jpg"
                },
                {
                    "id": 65,
                    "name": "Tower Defense",
                    "slug": "tower-defense",
                    "language": "eng",
                    "games_count": 4036,
                    "image_background": "https://media.rawg.io/media/games/1d0/1d01242356819c4cdd0f1a4baa46bd37.jpeg"
                },
                {
                    "id": 60,
                    "name": "Touch-Friendly",
                    "slug": "touch-friendly",
                    "language": "eng",
                    "games_count": 1265,
                    "image_background": "https://media.rawg.io/media/screenshots/4a0/4a067c93dd1f331ac7a2e77bb3fc46e0.jpg"
                }
            ],
            "esrb_rating": {
                "id": 2,
                "name": "Everyone 10+",
                "slug": "everyone-10-plus"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/screenshots/e9f/e9f8ec3156f19f61071a871cc2ef4f1f.jpg"
                },
                {
                    "id": 179926,
                    "image": "https://media.rawg.io/media/screenshots/f83/f8364d8b8029926b0be4b4e4994180bf.jpg"
                },
                {
                    "id": 179927,
                    "image": "https://media.rawg.io/media/screenshots/ae2/ae274980bcee762967c390905932bd2f.jpg"
                },
                {
                    "id": 179928,
                    "image": "https://media.rawg.io/media/screenshots/1e7/1e75c620023bc4cc297f2b4e661044ca.jpg"
                },
                {
                    "id": 179929,
                    "image": "https://media.rawg.io/media/screenshots/12a/12a44add7abafff91eccf696a8aa4917.jpg"
                },
                {
                    "id": 179930,
                    "image": "https://media.rawg.io/media/screenshots/e9a/e9a2750222edfcddc9bace621e391545.jpg"
                },
                {
                    "id": 179931,
                    "image": "https://media.rawg.io/media/screenshots/cf3/cf323c4d9c034b46fa81bfe238a0eb4b.jpg"
                }
            ]
        },
        {
            "id": 13387,
            "slug": "serious-sam-hd-the-second-encounter",
            "name": "Serious Sam HD: The Second Encounter",
            "released": "2010-04-28",
            "tba": false,
            "background_image": "https://media.rawg.io/media/screenshots/46a/46ac84997152eaf4f760257a60099231.jpg",
            "rating": 3.91,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 167,
                    "percent": 58.8
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 64,
                    "percent": 22.54
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 35,
                    "percent": 12.32
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 18,
                    "percent": 6.34
                }
            ],
            "ratings_count": 284,
            "reviews_text_count": 0,
            "added": 2496,
            "added_by_status": {
                "yet": 85,
                "owned": 2122,
                "beaten": 219,
                "toplay": 13,
                "dropped": 54,
                "playing": 3
            },
            "metacritic": 76,
            "playtime": 4,
            "suggestions_count": 620,
            "updated": "2020-09-17T06:06:31",
            "user_game": null,
            "reviews_count": 284,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2718,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    },
                    "released_at": "2010-04-28",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2010-04-28",
                    "requirements_en": {
                        "minimum": "<ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP w/SP1 or newer<br>\t\t\t\t\t\t</li><li><strong>Processor:</strong> Intel Pentium 4 3+ Ghz or AMD Athlon64 3500+<br>\t\t\t\t\t\t</li><li><strong>Memory:</strong> 1 GB for Windows XP or 2 GB for Windows Vista<br>\t\t\t\t\t\t</li><li><strong>Hard Drive:</strong> 2.2 GB free space<br>\t\t\t\t\t\t</li><li><strong>Graphics:</strong> nVidia GeForce 7600, ATI Radeon X1600 (Shader Model 3.0 Required)<br>\t\t\t\t\t\t</li><li><strong>Sound:</strong> Direct X 9.0c compatible sound card<br>\t\t\t\t\t\t</li><li><strong>DirectX®:</strong> DirectX 9.0c August 2009 Edition or newer<br>\t\t\t\t\t\t</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Pentium 4/Athlon 64 3 ГГц,1 Гб памяти,GeForce 7600/Radeon X1600,2.2 Гб на винчестере",
                        "recommended": "Core 2 Duo/Athlon X2 2 ГГц,2 Гб памяти,GeForce 8800/Radeon HD4850,2.2 Гб на винчестере"
                    }
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 38783,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                },
                {
                    "id": 51,
                    "name": "Indie",
                    "slug": "indie",
                    "games_count": 37118,
                    "image_background": "https://media.rawg.io/media/games/63f/63f0e68688cad279ed38cde931dbfcdb.jpg"
                }
            ],
            "stores": [
                {
                    "id": 47254,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    }
                },
                {
                    "id": 14725,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25538,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10201,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3138,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6731,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 13076,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10391,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7728,
                    "image_background": "https://media.rawg.io/media/games/26d/26d4437715bee60138dab4a7c8c59c92.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 13427,
                    "image_background": "https://media.rawg.io/media/screenshots/88b/88b5f27f07d6ca2f8a3cd0b36e03a670.jpg"
                },
                {
                    "id": 40850,
                    "name": "Steam Leaderboards",
                    "slug": "steam-leaderboards",
                    "language": "eng",
                    "games_count": 4682,
                    "image_background": "https://media.rawg.io/media/games/4cb/4cb855e8ef1578415a928e53c9f51867.png"
                },
                {
                    "id": 9,
                    "name": "Online Co-Op",
                    "slug": "online-co-op",
                    "language": "eng",
                    "games_count": 2717,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1559,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 26,
                    "name": "Gore",
                    "slug": "gore",
                    "language": "eng",
                    "games_count": 3814,
                    "image_background": "https://media.rawg.io/media/games/c80/c80bcf321da44d69b18a06c04d942662.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6483,
                    "image_background": "https://media.rawg.io/media/games/af7/af7a831001c5c32c46e950cc883b8cb7.jpg"
                },
                {
                    "id": 40852,
                    "name": "Steam Workshop",
                    "slug": "steam-workshop",
                    "language": "eng",
                    "games_count": 1093,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 40838,
                    "name": "Includes level editor",
                    "slug": "includes-level-editor",
                    "language": "eng",
                    "games_count": 1359,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 172,
                    "name": "Aliens",
                    "slug": "aliens",
                    "language": "eng",
                    "games_count": 4275,
                    "image_background": "https://media.rawg.io/media/games/739/73990e3ec9f43a9e8ecafe207fa4f368.jpg"
                },
                {
                    "id": 165,
                    "name": "Colorful",
                    "slug": "colorful",
                    "language": "eng",
                    "games_count": 9429,
                    "image_background": "https://media.rawg.io/media/games/0be/0bea0a08a4d954337305391b778a7f37.jpg"
                },
                {
                    "id": 271,
                    "name": "Remake",
                    "slug": "remake",
                    "language": "eng",
                    "games_count": 1119,
                    "image_background": "https://media.rawg.io/media/screenshots/46a/46ac84997152eaf4f760257a60099231.jpg"
                },
                {
                    "id": 284,
                    "name": "Cult Classic",
                    "slug": "cult-classic",
                    "language": "eng",
                    "games_count": 736,
                    "image_background": "https://media.rawg.io/media/games/826/82626e2d7ee7d96656fb9838c2ef7302.jpg"
                },
                {
                    "id": 52,
                    "name": "Arena Shooter",
                    "slug": "arena-shooter",
                    "language": "eng",
                    "games_count": 505,
                    "image_background": "https://media.rawg.io/media/screenshots/44c/44ce1104e7b3887344b728e7d009c25e.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/screenshots/46a/46ac84997152eaf4f760257a60099231.jpg"
                },
                {
                    "id": 114299,
                    "image": "https://media.rawg.io/media/screenshots/1a7/1a73e9503751fb8dfb784c11f6b49c75.jpg"
                },
                {
                    "id": 114300,
                    "image": "https://media.rawg.io/media/screenshots/393/393803989322ee9740ef710c3a827904.jpg"
                },
                {
                    "id": 114301,
                    "image": "https://media.rawg.io/media/screenshots/d61/d61359ca230e869e8da1f52e2013c8b9.jpg"
                },
                {
                    "id": 114302,
                    "image": "https://media.rawg.io/media/screenshots/d78/d78d77974908b13032f77b15874019ec.jpg"
                },
                {
                    "id": 114303,
                    "image": "https://media.rawg.io/media/screenshots/3b0/3b0606d8c8828ae0d522f62a1aa0fa83.jpg"
                },
                {
                    "id": 114304,
                    "image": "https://media.rawg.io/media/screenshots/f85/f85e42c51400b3e8d32a64c4e551bbfc.jpg"
                }
            ]
        },
        {
            "id": 401,
            "slug": "nioh",
            "name": "Nioh",
            "released": "2017-02-07",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/f84/f84c7c45e074117fb81fecf427f8b41f.jpg",
            "rating": 3.89,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 249,
                    "percent": 50.51
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 114,
                    "percent": 23.12
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 111,
                    "percent": 22.52
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 19,
                    "percent": 3.85
                }
            ],
            "ratings_count": 493,
            "reviews_text_count": 0,
            "added": 2496,
            "added_by_status": {
                "yet": 185,
                "owned": 1672,
                "beaten": 183,
                "toplay": 139,
                "dropped": 242,
                "playing": 75
            },
            "metacritic": 88,
            "playtime": 0,
            "suggestions_count": 649,
            "updated": "2020-08-22T19:34:14",
            "user_game": null,
            "reviews_count": 493,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2017-02-07",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3625,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    "released_at": "2017-02-07",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2017-02-07",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 36705,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                }
            ],
            "stores": [
                {
                    "id": 404,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13627,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11890,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 97,
                    "name": "Action RPG",
                    "slug": "action-rpg",
                    "language": "eng",
                    "games_count": 3474,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 233,
                    "name": "JRPG",
                    "slug": "jrpg",
                    "language": "eng",
                    "games_count": 2147,
                    "image_background": "https://media.rawg.io/media/screenshots/3ca/3ca548ad61d376aec77acbb03c774a98.jpeg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/f84/f84c7c45e074117fb81fecf427f8b41f.jpg"
                },
                {
                    "id": 3402,
                    "image": "https://media.rawg.io/media/screenshots/c9e/c9eae5e15cc7fe12846dfe069e9a14ed.jpg"
                },
                {
                    "id": 3404,
                    "image": "https://media.rawg.io/media/screenshots/f13/f139a7e0152dc9025d3fed4fa08def4f.jpg"
                },
                {
                    "id": 3405,
                    "image": "https://media.rawg.io/media/screenshots/a99/a99a28e5a9330a5471be992290b64057.jpg"
                },
                {
                    "id": 3406,
                    "image": "https://media.rawg.io/media/screenshots/e2a/e2a526eee19e295c8fdca07e0c8de762.jpg"
                },
                {
                    "id": 3408,
                    "image": "https://media.rawg.io/media/screenshots/578/578a8f8810c8fd6e74e7dbd4d5f3578c.jpg"
                },
                {
                    "id": 626183,
                    "image": "https://media.rawg.io/media/screenshots/a31/a31665e5d587304ecc637e11fb90df1c.jpg"
                }
            ]
        },
        {
            "id": 9835,
            "slug": "outlast-2",
            "name": "Outlast 2",
            "released": "2017-04-24",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/880/880f6aa65fe9d786f1a455963df76180.jpg",
            "rating": 3.66,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 216,
                    "percent": 53.07
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 98,
                    "percent": 24.08
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 60,
                    "percent": 14.74
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 33,
                    "percent": 8.11
                }
            ],
            "ratings_count": 406,
            "reviews_text_count": 0,
            "added": 2494,
            "added_by_status": {
                "yet": 239,
                "owned": 1720,
                "beaten": 303,
                "toplay": 104,
                "dropped": 106,
                "playing": 22
            },
            "metacritic": 76,
            "playtime": 5,
            "suggestions_count": 323,
            "updated": "2019-12-09T03:30:57",
            "user_game": null,
            "reviews_count": 407,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2017-04-24",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2017-04-24",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2017-04-24",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows Vista / 7 / 8 / 10,  64-bits<br></li><li><strong>Processor:</strong> Intel Core i3-530<br></li><li><strong>Memory:</strong> 4 GB RAM<br></li><li><strong>Graphics:</strong> 1GB VRAM, NVIDIA Geforce GTX 260 / ATI Radeon HD 4870<br></li><li><strong>DirectX:</strong> Version 10<br></li><li><strong>Storage:</strong> 30 GB available space<br></li><li><strong>Sound Card:</strong> DirectX Compatible<br></li><li><strong>Additional Notes:</strong> Targetting 720p @ 30 fps</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows Vista / 7 / 8 / 10,  64-bits<br></li><li><strong>Processor:</strong> Intel Core i5<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> 1.5GB VRAM, NVIDIA Geforce GTX 660 / ATI Radeon HD 7850<br></li><li><strong>DirectX:</strong> Version 11<br></li><li><strong>Storage:</strong> 30 GB available space<br></li><li><strong>Sound Card:</strong> DirectX Compatible<br></li><li><strong>Additional Notes:</strong> Targetting 1080p @ 60 fps</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4396,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    },
                    "released_at": "2017-04-24",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 87039,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                },
                {
                    "id": 51,
                    "name": "Indie",
                    "slug": "indie",
                    "games_count": 37118,
                    "image_background": "https://media.rawg.io/media/games/63f/63f0e68688cad279ed38cde931dbfcdb.jpg"
                }
            ],
            "stores": [
                {
                    "id": 24667,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                },
                {
                    "id": 10726,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                },
                {
                    "id": 25306,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                },
                {
                    "id": 26958,
                    "store": {
                        "id": 5,
                        "name": "GOG",
                        "slug": "gog",
                        "domain": "gog.com",
                        "games_count": 3363,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    }
                },
                {
                    "id": 46485,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8656,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13627,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10201,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 10150,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 13076,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 16,
                    "name": "Horror",
                    "slug": "horror",
                    "language": "eng",
                    "games_count": 21934,
                    "image_background": "https://media.rawg.io/media/games/2ad/2ad87a4a69b1104f02435c14c5196095.jpg"
                },
                {
                    "id": 26,
                    "name": "Gore",
                    "slug": "gore",
                    "language": "eng",
                    "games_count": 3814,
                    "image_background": "https://media.rawg.io/media/games/c80/c80bcf321da44d69b18a06c04d942662.jpg"
                },
                {
                    "id": 1,
                    "name": "Survival",
                    "slug": "survival",
                    "language": "eng",
                    "games_count": 4862,
                    "image_background": "https://media.rawg.io/media/games/9c4/9c47f320eb73c9a02d462e12f6206b26.jpg"
                },
                {
                    "id": 34,
                    "name": "Violent",
                    "slug": "violent",
                    "language": "eng",
                    "games_count": 4485,
                    "image_background": "https://media.rawg.io/media/games/a0e/a0ef08621301a1eab5e04fa5c96978fa.jpeg"
                },
                {
                    "id": 41,
                    "name": "Dark",
                    "slug": "dark",
                    "language": "eng",
                    "games_count": 7406,
                    "image_background": "https://media.rawg.io/media/games/4e6/4e6e8e7f50c237d76f38f3c885dae3d2.jpg"
                },
                {
                    "id": 44,
                    "name": "Nudity",
                    "slug": "nudity",
                    "language": "eng",
                    "games_count": 2632,
                    "image_background": "https://media.rawg.io/media/games/6cd/6cd653e0aaef5ff8bbd295bf4bcb12eb.jpg"
                },
                {
                    "id": 336,
                    "name": "controller support",
                    "slug": "controller-support",
                    "language": "eng",
                    "games_count": 293,
                    "image_background": "https://media.rawg.io/media/games/8a0/8a02f84a5916ede2f923b88d5f8217ba.jpg"
                },
                {
                    "id": 17,
                    "name": "Survival Horror",
                    "slug": "survival-horror",
                    "language": "eng",
                    "games_count": 4164,
                    "image_background": "https://media.rawg.io/media/games/157/1570121f5c4d240504f1eae5c3854733.jpg"
                },
                {
                    "id": 192,
                    "name": "Mature",
                    "slug": "mature",
                    "language": "eng",
                    "games_count": 900,
                    "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                },
                {
                    "id": 188,
                    "name": "Parkour",
                    "slug": "parkour",
                    "language": "eng",
                    "games_count": 1667,
                    "image_background": "https://media.rawg.io/media/games/cfe/cfe5960b5caca432f3575fc7d8ff736b.jpg"
                },
                {
                    "id": 334,
                    "name": "achievements",
                    "slug": "achievements",
                    "language": "eng",
                    "games_count": 4717,
                    "image_background": "https://media.rawg.io/media/games/c35/c354856af9151dc63844be4f9843d2c2.jpg"
                },
                {
                    "id": 50,
                    "name": "Sexual Content",
                    "slug": "sexual-content",
                    "language": "eng",
                    "games_count": 2227,
                    "image_background": "https://media.rawg.io/media/games/b4f/b4f94ed4afd6666763b78ffeecf30681.jpg"
                }
            ],
            "esrb_rating": {
                "id": 5,
                "name": "Adults Only",
                "slug": "adults-only"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/880/880f6aa65fe9d786f1a455963df76180.jpg"
                },
                {
                    "id": 73523,
                    "image": "https://media.rawg.io/media/screenshots/1d0/1d0baf5f83b7bd6d615a0159ced2d674.jpg"
                },
                {
                    "id": 73524,
                    "image": "https://media.rawg.io/media/screenshots/c9e/c9ec08fc80d4945670e52bc3e1b77309.jpg"
                },
                {
                    "id": 73525,
                    "image": "https://media.rawg.io/media/screenshots/c3b/c3b867117cf89e0968eee0c9386a17a4.jpg"
                },
                {
                    "id": 73526,
                    "image": "https://media.rawg.io/media/screenshots/090/090e7a24ab5af98f41d84f899805ed7d.jpg"
                },
                {
                    "id": 73527,
                    "image": "https://media.rawg.io/media/screenshots/ce1/ce1f3d7de2c382fd9c294bc6eb14aafc.jpg"
                },
                {
                    "id": 73528,
                    "image": "https://media.rawg.io/media/screenshots/de7/de78c971fad680c0952c851741544752.jpg"
                }
            ]
        },
        {
            "id": 13512,
            "slug": "cortex-command",
            "name": "Cortex Command",
            "released": "2012-09-28",
            "tba": false,
            "background_image": "https://media.rawg.io/media/screenshots/f81/f81fd968a3161e7d35612d8c4232923e.jpg",
            "rating": 2.61,
            "rating_top": 1,
            "ratings": [
                {
                    "id": 1,
                    "title": "skip",
                    "count": 80,
                    "percent": 39.6
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 58,
                    "percent": 28.71
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 47,
                    "percent": 23.27
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 17,
                    "percent": 8.42
                }
            ],
            "ratings_count": 202,
            "reviews_text_count": 0,
            "added": 2493,
            "added_by_status": {
                "yet": 127,
                "owned": 2282,
                "beaten": 23,
                "toplay": 3,
                "dropped": 56,
                "playing": 2
            },
            "metacritic": 44,
            "playtime": 2,
            "suggestions_count": 474,
            "updated": "2019-09-17T03:23:10",
            "user_game": null,
            "reviews_count": 202,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2012-09-28",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OSX:</strong>10.4 (OSX Tiger or Greater)<br>\t</li><li><strong>Processor:</strong>1.6 Ghz Core 2 Duo<br>\t</li><li><strong>RAM:</strong>1GB RAM<br>\t</li><li><strong>Graphics:</strong>Intel GMA X3100<br>\t</li><li><strong>Disk:</strong>300 mb</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2012-09-28",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Microsoft® Windows® XP / Vista / 7<br>\t</li><li><strong>Processor:</strong> 1GHz processor<br>\t</li><li><strong>Memory:</strong> 1GB  RAM<br>\t</li><li><strong>Hard Disk Space:</strong> 150MB HDD space<br>\t</li><li><strong>Video Card:</strong> 640x480 (VGA) resolution monitor<br>\t</li><li><strong>Additional:</strong> Should run on any PC released within the past 5 years.</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Microsoft® Windows® XP / Vista / 7<br>\t</li><li><strong>Processor:</strong> 3GHz or faster<br>\t</li><li><strong>Memory:</strong> 2GB RAM<br>\t</li><li><strong>Hard Disk Space:</strong> 150MB HDD space<br>\t</li><li><strong>Video Card:</strong> 1920x1080 (full HD 1080p) resolution monitor<br>\t</li><li><strong>Additional:</strong> Should run on any PC released within the past 5 years.</li></ul>"
                    },
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 10,
                    "name": "Strategy",
                    "slug": "strategy",
                    "games_count": 37479,
                    "image_background": "https://media.rawg.io/media/games/d03/d030347839f74454afcd1008248b08ae.jpg"
                },
                {
                    "id": 51,
                    "name": "Indie",
                    "slug": "indie",
                    "games_count": 37118,
                    "image_background": "https://media.rawg.io/media/games/63f/63f0e68688cad279ed38cde931dbfcdb.jpg"
                }
            ],
            "stores": [
                {
                    "id": 14863,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25538,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10201,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3138,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10391,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 45,
                    "name": "2D",
                    "slug": "2d",
                    "language": "eng",
                    "games_count": 111700,
                    "image_background": "https://media.rawg.io/media/screenshots/c97/c97b943741f5fbc936fe054d9d58851d.jpg"
                },
                {
                    "id": 49,
                    "name": "Difficult",
                    "slug": "difficult",
                    "language": "eng",
                    "games_count": 8427,
                    "image_background": "https://media.rawg.io/media/games/6c5/6c55e22185876626881b76c11922b073.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3536,
                    "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                },
                {
                    "id": 198,
                    "name": "Split Screen",
                    "slug": "split-screen",
                    "language": "eng",
                    "games_count": 4117,
                    "image_background": "https://media.rawg.io/media/games/9cc/9cc11e2e81403186c7fa9c00c143d6e4.jpg"
                },
                {
                    "id": 75,
                    "name": "Local Co-Op",
                    "slug": "local-co-op",
                    "language": "eng",
                    "games_count": 3855,
                    "image_background": "https://media.rawg.io/media/games/35b/35b47c4d85cd6e08f3e2ca43ea5ce7bb.jpg"
                },
                {
                    "id": 72,
                    "name": "Local Multiplayer",
                    "slug": "local-multiplayer",
                    "language": "eng",
                    "games_count": 9635,
                    "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                },
                {
                    "id": 40852,
                    "name": "Steam Workshop",
                    "slug": "steam-workshop",
                    "language": "eng",
                    "games_count": 1093,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 122,
                    "name": "Pixel Graphics",
                    "slug": "pixel-graphics",
                    "language": "eng",
                    "games_count": 50556,
                    "image_background": "https://media.rawg.io/media/screenshots/072/07222ab3475a9da84a0359bb3a33b679.jpg"
                },
                {
                    "id": 63,
                    "name": "Zombies",
                    "slug": "zombies",
                    "language": "eng",
                    "games_count": 6837,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 62,
                    "name": "Moddable",
                    "slug": "moddable",
                    "language": "eng",
                    "games_count": 548,
                    "image_background": "https://media.rawg.io/media/games/476/476178ef18ab0534771d099f51cdc694.jpg"
                },
                {
                    "id": 40838,
                    "name": "Includes level editor",
                    "slug": "includes-level-editor",
                    "language": "eng",
                    "games_count": 1359,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 5,
                    "name": "Replay Value",
                    "slug": "replay-value",
                    "language": "eng",
                    "games_count": 914,
                    "image_background": "https://media.rawg.io/media/games/e04/e04963f3ac4c4fa83a1dc0b9231e50db.jpg"
                },
                {
                    "id": 114,
                    "name": "Physics",
                    "slug": "physics",
                    "language": "eng",
                    "games_count": 12573,
                    "image_background": "https://media.rawg.io/media/screenshots/69b/69bb243ea9896ddfc2e051b58e81624d.jpg"
                },
                {
                    "id": 168,
                    "name": "RTS",
                    "slug": "rts",
                    "language": "eng",
                    "games_count": 1165,
                    "image_background": "https://media.rawg.io/media/games/d87/d87268c4b7b33b278cbc1f152db39729.jpg"
                },
                {
                    "id": 182,
                    "name": "4 Player Local",
                    "slug": "4-player-local",
                    "language": "eng",
                    "games_count": 580,
                    "image_background": "https://media.rawg.io/media/games/df4/df464501be72da0052bc5e4c8896a0aa.jpg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/screenshots/f81/f81fd968a3161e7d35612d8c4232923e.jpg"
                },
                {
                    "id": 115555,
                    "image": "https://media.rawg.io/media/screenshots/fb8/fb8e907272e1f0ac95323fce61cdca43.jpg"
                },
                {
                    "id": 115556,
                    "image": "https://media.rawg.io/media/screenshots/64f/64f608d2631c82d4b67437daf267f946.jpg"
                },
                {
                    "id": 115557,
                    "image": "https://media.rawg.io/media/screenshots/a8c/a8c4c3376921a3ba3cc255d50f111282.jpg"
                },
                {
                    "id": 115558,
                    "image": "https://media.rawg.io/media/screenshots/4b8/4b82c1795cd3ff88ec1e82fd2041f6f7.jpg"
                },
                {
                    "id": 115559,
                    "image": "https://media.rawg.io/media/screenshots/853/8533ee3711332badeb959e506256d94d.jpg"
                },
                {
                    "id": 115560,
                    "image": "https://media.rawg.io/media/screenshots/db2/db2a4da52b4feff3e0fbb46818b114a9.jpg"
                }
            ]
        },
        {
            "id": 42187,
            "slug": "the-sims-4",
            "name": "The Sims 4",
            "released": "2014-09-02",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/e44/e445335e611b4ccf03af71fffcbd30a4.jpg",
            "rating": 3.69,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 350,
                    "percent": 56.73
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 162,
                    "percent": 26.26
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 72,
                    "percent": 11.67
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 33,
                    "percent": 5.35
                }
            ],
            "ratings_count": 610,
            "reviews_text_count": 4,
            "added": 2489,
            "added_by_status": {
                "yet": 94,
                "owned": 1638,
                "beaten": 232,
                "toplay": 28,
                "dropped": 309,
                "playing": 188
            },
            "metacritic": 67,
            "playtime": 6,
            "suggestions_count": 459,
            "updated": "2020-08-27T20:20:33",
            "user_game": null,
            "reviews_count": 617,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2014-09-02",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2014-09-02",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2014-09-02",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2020-06-18",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li>Requires a 64-bit processor and operating system<br></li><li><strong>OS:</strong> 64 Bit Required. Windows 7 (SP1), Windows 8, Windows 8.1, or Windows 10<br></li><li><strong>Processor:</strong> 1.8 GHz Intel Core 2 Duo, AMD Athlon 64 Dual-Core 4000+ or equivalent (For computers using built-in graphics chipsets, the game requires 2.0 GHz Intel Core 2 Duo, 2.0 GHz AMD Turion 64 X2 TL-62 or equivalent)<br></li><li><strong>Memory:</strong> 4 GB RAM<br></li><li><strong>Graphics:</strong> 128 MB of Video RAM and support for Pixel Shader 3.0. Supported Video Cards: NVIDIA GeForce 6600 or better, ATI Radeon X1300 or better, Intel GMA X4500 or better<br></li><li><strong>DirectX:</strong> Version 9.0<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 17 GB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li>Requires a 64-bit processor and operating system<br></li><li><strong>OS:</strong> 64 Bit Windows 7 (SP1), 8, 8.1, or 10<br></li><li><strong>Processor:</strong> Intel core i5 or faster, AMD Athlon X4<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GTX 650 or better<br></li><li><strong>DirectX:</strong> Version 9.0<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 18 GB available space</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Win Xp 32,Core 2 Duo 1.8GHz/Athlon 64 X2 4000+,GeForce 6600 GT/Radeon X1300,DX 9,2 GB RAM,9 GB HDD",
                        "recommended": "Win Xp 32,Core i5-680 3.6GHz/Athlon X4 750K,GeForce GTX 650/Radeon HD 7750,DX 9,4 GB RAM,9 GB HDD"
                    }
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                }
            ],
            "genres": [
                {
                    "id": 10,
                    "name": "Strategy",
                    "slug": "strategy",
                    "games_count": 37479,
                    "image_background": "https://media.rawg.io/media/games/d03/d030347839f74454afcd1008248b08ae.jpg"
                },
                {
                    "id": 14,
                    "name": "Simulation",
                    "slug": "simulation",
                    "games_count": 46545,
                    "image_background": "https://media.rawg.io/media/games/2e1/2e187b31e5cee21c110bd16798d75fab.jpg"
                },
                {
                    "id": 40,
                    "name": "Casual",
                    "slug": "casual",
                    "games_count": 31919,
                    "image_background": "https://media.rawg.io/media/games/35b/35b47c4d85cd6e08f3e2ca43ea5ce7bb.jpg"
                }
            ],
            "stores": [
                {
                    "id": 476012,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                },
                {
                    "id": 36660,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                },
                {
                    "id": 36630,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25538,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13627,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 13427,
                    "image_background": "https://media.rawg.io/media/screenshots/88b/88b5f27f07d6ca2f8a3cd0b36e03a670.jpg"
                },
                {
                    "id": 64,
                    "name": "Fantasy",
                    "slug": "fantasy",
                    "language": "eng",
                    "games_count": 13341,
                    "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                },
                {
                    "id": 107,
                    "name": "Family Friendly",
                    "slug": "family-friendly",
                    "language": "eng",
                    "games_count": 2202,
                    "image_background": "https://media.rawg.io/media/games/f15/f15e1dbda32b588a981bbc6b222a4b4c.jpg"
                },
                {
                    "id": 121,
                    "name": "Character Customization",
                    "slug": "character-customization",
                    "language": "eng",
                    "games_count": 1509,
                    "image_background": "https://media.rawg.io/media/games/214/214b29aeff13a0ae6a70fc4426e85991.jpg"
                },
                {
                    "id": 88,
                    "name": "Cute",
                    "slug": "cute",
                    "language": "eng",
                    "games_count": 15386,
                    "image_background": "https://media.rawg.io/media/games/416/4164ca654a339af5be8e63cc9c480c70.jpg"
                },
                {
                    "id": 77,
                    "name": "Realistic",
                    "slug": "realistic",
                    "language": "eng",
                    "games_count": 1496,
                    "image_background": "https://media.rawg.io/media/games/436/436201bdffb5e27c9ea883a8fd026f69.jpg"
                },
                {
                    "id": 39,
                    "name": "Building",
                    "slug": "building",
                    "language": "eng",
                    "games_count": 3360,
                    "image_background": "https://media.rawg.io/media/games/7a6/7a6f90e85a2e264c3b440bb4787cf378.jpg"
                },
                {
                    "id": 50,
                    "name": "Sexual Content",
                    "slug": "sexual-content",
                    "language": "eng",
                    "games_count": 2227,
                    "image_background": "https://media.rawg.io/media/games/b4f/b4f94ed4afd6666763b78ffeecf30681.jpg"
                },
                {
                    "id": 138,
                    "name": "Relaxing",
                    "slug": "relaxing",
                    "language": "eng",
                    "games_count": 6740,
                    "image_background": "https://media.rawg.io/media/screenshots/0de/0de6cfe8744a8d5b08b448ff485f2101.jpg"
                },
                {
                    "id": 571,
                    "name": "3D",
                    "slug": "3d",
                    "language": "eng",
                    "games_count": 39321,
                    "image_background": "https://media.rawg.io/media/screenshots/120/120d930368bc171c42f9caab94e33c65.jpg"
                },
                {
                    "id": 40937,
                    "name": "Steam Trading Cards",
                    "slug": "steam-trading-cards-2",
                    "language": "eng",
                    "games_count": 207,
                    "image_background": "https://media.rawg.io/media/games/473/473bd9a5e9522629d6cb28b701fb836a.jpg"
                },
                {
                    "id": 217,
                    "name": "Romance",
                    "slug": "romance",
                    "language": "eng",
                    "games_count": 3566,
                    "image_background": "https://media.rawg.io/media/games/972/972aea3c9eb253e893947bec2d2cfbb9.jpg"
                },
                {
                    "id": 164,
                    "name": "Cartoony",
                    "slug": "cartoony",
                    "language": "eng",
                    "games_count": 1329,
                    "image_background": "https://media.rawg.io/media/screenshots/b54/b5455f679a7e626f32ef8b78392cc327_xVnsIrO.jpg"
                },
                {
                    "id": 577,
                    "name": "Beautiful",
                    "slug": "beautiful",
                    "language": "eng",
                    "games_count": 1638,
                    "image_background": "https://media.rawg.io/media/games/cb1/cb14d42b58bdb6cf5948d0eed778c2f0.jpg"
                },
                {
                    "id": 42473,
                    "name": "Immersive Sim",
                    "slug": "immersive-sim-2",
                    "language": "eng",
                    "games_count": 386,
                    "image_background": "https://media.rawg.io/media/screenshots/aab/aab0efe4fb375b9e974f4c4c50a6e728.jpg"
                },
                {
                    "id": 42410,
                    "name": "LGBTQ+",
                    "slug": "lgbtq-2",
                    "language": "eng",
                    "games_count": 457,
                    "image_background": "https://media.rawg.io/media/screenshots/936/936b9bfc03a9d50099f65393c2bc7c2e.jpeg"
                },
                {
                    "id": 43578,
                    "name": "Remote Play on Tablet",
                    "slug": "remote-play-on-tablet",
                    "language": "eng",
                    "games_count": 63,
                    "image_background": "https://media.rawg.io/media/games/07a/07a74470a2618fd71945db0619602baf.jpg"
                },
                {
                    "id": 1411,
                    "name": "build",
                    "slug": "build",
                    "language": "eng",
                    "games_count": 3889,
                    "image_background": "https://media.rawg.io/media/screenshots/520/520ed5686073be29438e995febc4426d.jpg"
                },
                {
                    "id": 10766,
                    "name": "reality-based",
                    "slug": "reality-based",
                    "language": "eng",
                    "games_count": 43,
                    "image_background": "https://media.rawg.io/media/screenshots/abf/abf78bfd9fbe3ae9deef030510ec9fa7_DuTr1td.jpg"
                },
                {
                    "id": 49960,
                    "name": "Life Sim",
                    "slug": "life-sim-2",
                    "language": "eng",
                    "games_count": 296,
                    "image_background": "https://media.rawg.io/media/screenshots/ec1/ec1d758d96d3f6933d95de1735491c9c.jpg"
                },
                {
                    "id": 975,
                    "name": "life",
                    "slug": "life",
                    "language": "eng",
                    "games_count": 104,
                    "image_background": "https://media.rawg.io/media/screenshots/835/835291a7b0f22cfa5e8da484d1e7d800.jpg"
                },
                {
                    "id": 28932,
                    "name": "family-simulator",
                    "slug": "family-simulator",
                    "language": "eng",
                    "games_count": 2,
                    "image_background": "https://media.rawg.io/media/games/e44/e445335e611b4ccf03af71fffcbd30a4.jpg"
                }
            ],
            "esrb_rating": {
                "id": 3,
                "name": "Teen",
                "slug": "teen"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/e44/e445335e611b4ccf03af71fffcbd30a4.jpg"
                },
                {
                    "id": 609410,
                    "image": "https://media.rawg.io/media/screenshots/72c/72c690315354c314ed292aac71aeb231.jpg"
                },
                {
                    "id": 609411,
                    "image": "https://media.rawg.io/media/screenshots/5da/5da8b4ed0c50a84db6aa8a6504854d14.jpg"
                },
                {
                    "id": 609412,
                    "image": "https://media.rawg.io/media/screenshots/695/69566d0e355c337308742bce08f36af0.jpg"
                },
                {
                    "id": 609413,
                    "image": "https://media.rawg.io/media/screenshots/95c/95c67b60122424e021ccf028829c529c.jpg"
                },
                {
                    "id": 609414,
                    "image": "https://media.rawg.io/media/screenshots/ceb/ceb2381b094ec125cffb76bcf1afdea8.jpg"
                },
                {
                    "id": 609415,
                    "image": "https://media.rawg.io/media/screenshots/95a/95aa076f45d0b25830f60c05e001cfc8.jpg"
                }
            ]
        },
        {
            "id": 3850,
            "slug": "lego-marvel",
            "name": "LEGO Marvel Super Heroes",
            "released": "2013-10-22",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/a87/a8743bdee8627c55bb9f2f01b9136ac1.jpg",
            "rating": 3.85,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 305,
                    "percent": 65.59
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 82,
                    "percent": 17.63
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 61,
                    "percent": 13.12
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 17,
                    "percent": 3.66
                }
            ],
            "ratings_count": 463,
            "reviews_text_count": 2,
            "added": 2485,
            "added_by_status": {
                "yet": 83,
                "owned": 1830,
                "beaten": 377,
                "toplay": 30,
                "dropped": 144,
                "playing": 21
            },
            "metacritic": 78,
            "playtime": 8,
            "suggestions_count": 514,
            "updated": "2019-09-17T03:28:50",
            "user_game": null,
            "reviews_count": 465,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2013-11-22",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2013-11-15",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3625,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    "released_at": "2013-10-22",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 19,
                        "name": "PS Vita",
                        "slug": "ps-vita",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 1938,
                        "image_background": "https://media.rawg.io/media/games/6d3/6d33014a4ed48a19c30a77ead5a0f62e.jpg"
                    },
                    "released_at": "2013-10-22",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 10,
                        "name": "Wii U",
                        "slug": "wii-u",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 1275,
                        "image_background": "https://media.rawg.io/media/games/6c8/6c8cb4780ce30b76b944cf656e8fff49.jpg"
                    },
                    "released_at": "2013-10-22",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37877,
                        "image_background": "https://media.rawg.io/media/games/283/283e7e600366b0da7021883d27159b27.jpg"
                    },
                    "released_at": "2013-10-22",
                    "requirements_en": {
                        "minimum": "4.0.3 and up"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2718,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    },
                    "released_at": "2013-10-22",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2013-10-22",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows®XP SP3, Windows Vista/7/8 with latest service packs and updates installed<br></li><li><strong>Processor:</strong> AMD Athlon 64 X2 EE 3800+ (2*2000 Mhz) or similar Intel CPU, such as Intel Pentium Dual Core E2180 (2*2000 Mhz)<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GeForce 7600 GS or ATI Radeon X1950 Pro or better<br></li><li><strong>DirectX:</strong> Version 10<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 7 GB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP/Vista/7/8<br></li><li><strong>Processor:</strong> AMD or Intel Quad Core running at 4*2600 Mhz<br></li><li><strong>Memory:</strong> 4 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GeForce GTX 480 or ATI Radeon HD 5850 or better<br></li><li><strong>DirectX:</strong> Version 11<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 8 GB available space</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2014-05-08",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> 10.8.5<br></li><li><strong>Processor:</strong> 1.8 GHz Intel Core 2 Duo (Dual-Core)<br></li><li><strong>Memory:</strong> 4 GB RAM<br></li><li><strong>Graphics:</strong> 256MB VRAM<br></li><li><strong>Storage:</strong> 7 GB available space<br></li><li><strong>Additional Notes:</strong> The following graphics cards are not supported: ATI X1xxx series, ATI HD2xxx series, Intel GMA series, Intel HD3000, NVIDIA 7xxx series, NVIDIA 8xxx series, NVIDIA 9400 and NVIDIA 320M.</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> 10.9.3<br></li><li><strong>Processor:</strong> 2.4 GHz<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> 1GB VRAM<br></li><li><strong>Storage:</strong> 7 GB available space<br></li><li><strong>Additional Notes:</strong> The following graphics cards are not supported: ATI X1xxx series, ATI HD2xxx series, Intel GMA series, Intel HD3000, NVIDIA 7xxx series, NVIDIA 8xxx series, NVIDIA 9400 and NVIDIA 320M.</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "iOS",
                        "slug": "ios",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70857,
                        "image_background": "https://media.rawg.io/media/games/be0/be084b850302abe81675bc4ffc08a0d0.jpg"
                    },
                    "released_at": "2014-06-19",
                    "requirements_en": {
                        "minimum": "iPhone 4, iPad 2 Wifi, iPad 2 3G, iPhone 4S, iPad Third Gen, iPad Third Gen 4G, iPhone 5, iPod Touch Fifth Gen, iPad Fourth Gen, iPad Fourth Gen 4G, iPad Mini, iPad Mini 4G, iPhone 5c, iPhone 5s, iPad Air, iPad Air Cellular, iPad Mini Retina, iPad Mini Retina Cellular, iPhone 6, iPhone 6 Plus, iPad Air 2, iPad Air 2 Cellular, iPad Mini 3, iPad Mini 3 Cellular, iPod Touch Sixth Gen, iPhone 6s, iPhone 6s Plus, iPad Mini 4, iPad Mini 4 Cellular, iPad Pro, iPad Pro Cellular, iPad Pro 9.7, iPad Pro 9.7 Cellular, iPhone SE, iPhone 7, iPhone 7 Plus, iPad 6 1 1, iPad 6 1 2, iPad 7 1, iPad 7 2, iPad 7 3, iPad 7 4, iPhone 8, iPhone 8 Plus, iPhone X, iPad 7 5, iPad 7 6, iPhone X S, iPhone X S Max, iPhone X R, iPad 8 1 2, iPad 8 3 4, iPad 8 5 6, iPad 8 7 8, iPad Mini 5, iPad Mini 5 Cellular, iPad Air 3, iPad Air 3 Cellular, iPod Touch Seventh Gen"
                    },
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "iOS",
                        "slug": "ios"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 87039,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                },
                {
                    "id": 19,
                    "name": "Family",
                    "slug": "family",
                    "games_count": 5324,
                    "image_background": "https://media.rawg.io/media/screenshots/fb9/fb912e77c4295b0c47af632cd1b48522.jpeg"
                }
            ],
            "stores": [
                {
                    "id": 4163,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                },
                {
                    "id": 257782,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    }
                },
                {
                    "id": 8954,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                },
                {
                    "id": 19596,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                },
                {
                    "id": 32006,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8656,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    }
                },
                {
                    "id": 59937,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 69259,
                        "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                    }
                },
                {
                    "id": 219763,
                    "store": {
                        "id": 8,
                        "name": "Google Play",
                        "slug": "google-play",
                        "domain": "play.google.com",
                        "games_count": 16323,
                        "image_background": "https://media.rawg.io/media/games/e04/e04963f3ac4c4fa83a1dc0b9231e50db.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25538,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10201,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6731,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3792,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2813,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4399,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 4,
                    "name": "Funny",
                    "slug": "funny",
                    "language": "eng",
                    "games_count": 13427,
                    "image_background": "https://media.rawg.io/media/screenshots/88b/88b5f27f07d6ca2f8a3cd0b36e03a670.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3536,
                    "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6483,
                    "image_background": "https://media.rawg.io/media/games/af7/af7a831001c5c32c46e950cc883b8cb7.jpg"
                },
                {
                    "id": 198,
                    "name": "Split Screen",
                    "slug": "split-screen",
                    "language": "eng",
                    "games_count": 4117,
                    "image_background": "https://media.rawg.io/media/games/9cc/9cc11e2e81403186c7fa9c00c143d6e4.jpg"
                },
                {
                    "id": 75,
                    "name": "Local Co-Op",
                    "slug": "local-co-op",
                    "language": "eng",
                    "games_count": 3855,
                    "image_background": "https://media.rawg.io/media/games/35b/35b47c4d85cd6e08f3e2ca43ea5ce7bb.jpg"
                },
                {
                    "id": 72,
                    "name": "Local Multiplayer",
                    "slug": "local-multiplayer",
                    "language": "eng",
                    "games_count": 9635,
                    "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                },
                {
                    "id": 107,
                    "name": "Family Friendly",
                    "slug": "family-friendly",
                    "language": "eng",
                    "games_count": 2202,
                    "image_background": "https://media.rawg.io/media/games/f15/f15e1dbda32b588a981bbc6b222a4b4c.jpg"
                },
                {
                    "id": 268,
                    "name": "Comic Book",
                    "slug": "comic-book",
                    "language": "eng",
                    "games_count": 278,
                    "image_background": "https://media.rawg.io/media/games/f39/f394c09e4760251c58e9ab9f45d7718c.jpg"
                },
                {
                    "id": 234,
                    "name": "Superhero",
                    "slug": "superhero",
                    "language": "eng",
                    "games_count": 877,
                    "image_background": "https://media.rawg.io/media/games/3c8/3c872330c4e9966a5a06c1371525e760.jpg"
                },
                {
                    "id": 297,
                    "name": "LEGO",
                    "slug": "lego",
                    "language": "eng",
                    "games_count": 108,
                    "image_background": "https://media.rawg.io/media/screenshots/a8c/a8cd58ee985ab6d509370bddada91dbd.jpeg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/a87/a8743bdee8627c55bb9f2f01b9136ac1.jpg"
                },
                {
                    "id": 32748,
                    "image": "https://media.rawg.io/media/screenshots/0c4/0c455af3e4b6dc05824c9842c2712aa1.jpg"
                },
                {
                    "id": 32749,
                    "image": "https://media.rawg.io/media/screenshots/ffd/ffd5be8a612ee733dbb56babb092ac65.jpg"
                },
                {
                    "id": 32750,
                    "image": "https://media.rawg.io/media/screenshots/71b/71b985dec036a127d8f9461d1ee47384.jpg"
                },
                {
                    "id": 32751,
                    "image": "https://media.rawg.io/media/screenshots/a31/a31388acd152e05c8085339add878a75.jpg"
                },
                {
                    "id": 32752,
                    "image": "https://media.rawg.io/media/screenshots/9a4/9a43ac846e777026d7d7ac8a3e864e8b.jpg"
                },
                {
                    "id": 32753,
                    "image": "https://media.rawg.io/media/screenshots/d43/d4326a36f7d0de4312a1260c6df499a1.jpg"
                }
            ]
        },
        {
            "id": 99,
            "slug": "snake-pass",
            "name": "Snake Pass",
            "released": "2017-03-28",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/f15/f15e1dbda32b588a981bbc6b222a4b4c.jpg",
            "rating": 3.32,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 92,
                    "percent": 48.68
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 45,
                    "percent": 23.81
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 34,
                    "percent": 17.99
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 18,
                    "percent": 9.52
                }
            ],
            "ratings_count": 183,
            "reviews_text_count": 4,
            "added": 2484,
            "added_by_status": {
                "yet": 157,
                "owned": 2126,
                "beaten": 51,
                "toplay": 28,
                "dropped": 105,
                "playing": 17
            },
            "metacritic": 71,
            "playtime": 3,
            "suggestions_count": 501,
            "updated": "2020-08-12T16:40:51",
            "user_game": null,
            "reviews_count": 189,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2017-03-28",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2017-03-28",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2017-03-28",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 8/10 (64-bit OS required)<br></li><li><strong>Processor:</strong> Intel Core i5-750 2.68Ghz / AMD II x4 945 3.0Ghz or equivalent<br></li><li><strong>Memory:</strong> 4 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GTX 560 2GB/AMD Radeon 6870 HD 2GB or equivalent (Integrated graphics not supported)<br></li><li><strong>DirectX:</strong> Version 11<br></li><li><strong>Storage:</strong> 5 GB available space</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4396,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    },
                    "released_at": "2017-03-28",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 87039,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                },
                {
                    "id": 14,
                    "name": "Simulation",
                    "slug": "simulation",
                    "games_count": 46545,
                    "image_background": "https://media.rawg.io/media/games/2e1/2e187b31e5cee21c110bd16798d75fab.jpg"
                },
                {
                    "id": 40,
                    "name": "Casual",
                    "slug": "casual",
                    "games_count": 31919,
                    "image_background": "https://media.rawg.io/media/games/35b/35b47c4d85cd6e08f3e2ca43ea5ce7bb.jpg"
                },
                {
                    "id": 51,
                    "name": "Indie",
                    "slug": "indie",
                    "games_count": 37118,
                    "image_background": "https://media.rawg.io/media/games/63f/63f0e68688cad279ed38cde931dbfcdb.jpg"
                },
                {
                    "id": 7,
                    "name": "Puzzle",
                    "slug": "puzzle",
                    "games_count": 65632,
                    "image_background": "https://media.rawg.io/media/games/4cb/4cb855e8ef1578415a928e53c9f51867.png"
                }
            ],
            "stores": [
                {
                    "id": 1259,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                },
                {
                    "id": 99,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                },
                {
                    "id": 11837,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                },
                {
                    "id": 32750,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8656,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10201,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3138,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 40850,
                    "name": "Steam Leaderboards",
                    "slug": "steam-leaderboards",
                    "language": "eng",
                    "games_count": 4682,
                    "image_background": "https://media.rawg.io/media/games/4cb/4cb855e8ef1578415a928e53c9f51867.png"
                },
                {
                    "id": 49,
                    "name": "Difficult",
                    "slug": "difficult",
                    "language": "eng",
                    "games_count": 8427,
                    "image_background": "https://media.rawg.io/media/games/6c5/6c55e22185876626881b76c11922b073.jpg"
                },
                {
                    "id": 107,
                    "name": "Family Friendly",
                    "slug": "family-friendly",
                    "language": "eng",
                    "games_count": 2202,
                    "image_background": "https://media.rawg.io/media/games/f15/f15e1dbda32b588a981bbc6b222a4b4c.jpg"
                },
                {
                    "id": 88,
                    "name": "Cute",
                    "slug": "cute",
                    "language": "eng",
                    "games_count": 15386,
                    "image_background": "https://media.rawg.io/media/games/416/4164ca654a339af5be8e63cc9c480c70.jpg"
                },
                {
                    "id": 114,
                    "name": "Physics",
                    "slug": "physics",
                    "language": "eng",
                    "games_count": 12573,
                    "image_background": "https://media.rawg.io/media/screenshots/69b/69bb243ea9896ddfc2e051b58e81624d.jpg"
                },
                {
                    "id": 165,
                    "name": "Colorful",
                    "slug": "colorful",
                    "language": "eng",
                    "games_count": 9429,
                    "image_background": "https://media.rawg.io/media/games/0be/0bea0a08a4d954337305391b778a7f37.jpg"
                },
                {
                    "id": 83,
                    "name": "Puzzle-Platformer",
                    "slug": "puzzle-platformer",
                    "language": "eng",
                    "games_count": 6966,
                    "image_background": "https://media.rawg.io/media/screenshots/2d9/2d9f74addd8f5b5f83459c2cb700aaf4.jpg"
                },
                {
                    "id": 229,
                    "name": "3D Platformer",
                    "slug": "3d-platformer",
                    "language": "eng",
                    "games_count": 5354,
                    "image_background": "https://media.rawg.io/media/games/213/2138ba3c97d02b581ca0b50805fcd49c.jpg"
                }
            ],
            "esrb_rating": {
                "id": 1,
                "name": "Everyone",
                "slug": "everyone"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/f15/f15e1dbda32b588a981bbc6b222a4b4c.jpg"
                },
                {
                    "id": 689,
                    "image": "https://media.rawg.io/media/screenshots/5a6/5a614049120825a29590c6dbf9f48414.jpg"
                },
                {
                    "id": 692,
                    "image": "https://media.rawg.io/media/screenshots/676/6768154ad2cf7bde24e4e6a10c09d0d4.jpg"
                },
                {
                    "id": 696,
                    "image": "https://media.rawg.io/media/screenshots/1ce/1ce6f8f51b6d4aa7947e7f5fc65991e3.jpg"
                },
                {
                    "id": 700,
                    "image": "https://media.rawg.io/media/screenshots/0c5/0c5c4383b3ef02070bd7780ccc44fcf5.jpg"
                },
                {
                    "id": 10794,
                    "image": "https://media.rawg.io/media/screenshots/8ce/8cee0083bf47f69ef530c541131399c5.jpg"
                },
                {
                    "id": 10798,
                    "image": "https://media.rawg.io/media/screenshots/bcb/bcb12689d3ca4596e3b53596465d9a57.jpg"
                }
            ]
        },
        {
            "id": 7485,
            "slug": "elite-dangerous",
            "name": "Elite Dangerous",
            "released": "2015-04-02",
            "tba": false,
            "background_image": "https://media.rawg.io/media/screenshots/aa7/aa79f4bd5f66ad92f712aee34cc6c3b1.jpg",
            "rating": 3.98,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 162,
                    "percent": 48.65
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 100,
                    "percent": 30.03
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 54,
                    "percent": 16.22
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 17,
                    "percent": 5.11
                }
            ],
            "ratings_count": 329,
            "reviews_text_count": 2,
            "added": 2481,
            "added_by_status": {
                "yet": 130,
                "owned": 1952,
                "beaten": 43,
                "toplay": 54,
                "dropped": 190,
                "playing": 112
            },
            "metacritic": 80,
            "playtime": 14,
            "suggestions_count": 513,
            "updated": "2021-05-06T11:31:22",
            "user_game": null,
            "reviews_count": 333,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2016-04-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": null,
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2015-04-02",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7, Windows 8<br></li><li><strong>Processor:</strong> Quad Core CPU (4 x 2Ghz)<br></li><li><strong>Memory:</strong> 4 GB RAM<br></li><li><strong>Graphics:</strong> Nvidia GTX 260 / ATI 4870HD<br></li><li><strong>DirectX:</strong> Version 11<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 25 GB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7, Windows 8<br></li><li><strong>Processor:</strong> Intel Core i7-3770K Quad Core CPU or better / AMD FX 4350 Quad Core CPU or better<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> Nvidia GTX 770 / AMD Radeon R9 280X<br></li><li><strong>DirectX:</strong> Version 11<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 25 GB available space<br></li><li><strong>Additional Notes:</strong> Supports Oculus Rift and TrackIR</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2015-04-02",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> OS X Yosemite (version 10.10.3)<br></li><li><strong>Processor:</strong> 2.3Ghz quad-core Intel Core i5 CPU<br></li><li><strong>Memory:</strong> 4 GB RAM<br></li><li><strong>Graphics:</strong> Nvidia GT 650M 1GB (or equivalent)<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 8 GB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> OS X Yosemite (version 10.10.3)<br></li><li><strong>Processor:</strong> 3.4GHz quad-core Intel Core i7 CPU<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> Nvidia GeForce GTX 775M (2GB video memory) / AMD Radeon R9 M290X (2GB video memory)<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 8 GB available space</li></ul>"
                    },
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 87039,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 36705,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                },
                {
                    "id": 14,
                    "name": "Simulation",
                    "slug": "simulation",
                    "games_count": 46545,
                    "image_background": "https://media.rawg.io/media/games/2e1/2e187b31e5cee21c110bd16798d75fab.jpg"
                },
                {
                    "id": 59,
                    "name": "Massively Multiplayer",
                    "slug": "massively-multiplayer",
                    "games_count": 2479,
                    "image_background": "https://media.rawg.io/media/games/98c/98cd77a9f61b31a6ddab1670b079c841.jpg"
                }
            ],
            "stores": [
                {
                    "id": 593060,
                    "store": {
                        "id": 11,
                        "name": "Epic Games",
                        "slug": "epic-games",
                        "domain": "epicgames.com",
                        "games_count": 530,
                        "image_background": "https://media.rawg.io/media/games/0af/0af85e8edddfa55368e47c539914a220.jpg"
                    }
                },
                {
                    "id": 27826,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                },
                {
                    "id": 8133,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                },
                {
                    "id": 10599,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25538,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11890,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6731,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3792,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 13076,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10391,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7337,
                    "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                },
                {
                    "id": 9,
                    "name": "Online Co-Op",
                    "slug": "online-co-op",
                    "language": "eng",
                    "games_count": 2717,
                    "image_background": "https://media.rawg.io/media/games/d58/d588947d4286e7b5e0e12e1bea7d9844.jpg"
                },
                {
                    "id": 49,
                    "name": "Difficult",
                    "slug": "difficult",
                    "language": "eng",
                    "games_count": 8427,
                    "image_background": "https://media.rawg.io/media/games/6c5/6c55e22185876626881b76c11922b073.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3536,
                    "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                },
                {
                    "id": 6,
                    "name": "Exploration",
                    "slug": "exploration",
                    "language": "eng",
                    "games_count": 10579,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 25,
                    "name": "Space",
                    "slug": "space",
                    "language": "eng",
                    "games_count": 27587,
                    "image_background": "https://media.rawg.io/media/games/328/3283617cb7d75d67257fc58339188742.jpg"
                },
                {
                    "id": 33,
                    "name": "VR",
                    "slug": "vr",
                    "language": "eng",
                    "games_count": 8751,
                    "image_background": "https://media.rawg.io/media/games/786/7863e587bac630de82fca50d799236a9.jpg"
                },
                {
                    "id": 1656,
                    "name": "mmo",
                    "slug": "mmo",
                    "language": "eng",
                    "games_count": 1192,
                    "image_background": "https://media.rawg.io/media/games/26b/26b27e1da9e3727fcb12e3e4e86c8c19.jpg"
                },
                {
                    "id": 245,
                    "name": "Trading",
                    "slug": "trading",
                    "language": "eng",
                    "games_count": 678,
                    "image_background": "https://media.rawg.io/media/screenshots/364/3640726eff1d5c28eeb56f37b31cc339.jpg"
                },
                {
                    "id": 241,
                    "name": "Space Sim",
                    "slug": "space-sim",
                    "language": "eng",
                    "games_count": 1042,
                    "image_background": "https://media.rawg.io/media/screenshots/073/07349dcc41f4d1f095f26fb873cbf0d5.jpg"
                },
                {
                    "id": 129,
                    "name": "TrackIR",
                    "slug": "trackir",
                    "language": "eng",
                    "games_count": 36,
                    "image_background": "https://media.rawg.io/media/games/3cd/3cd4cbb8b39f14c8e6970d06142f17cb.jpg"
                }
            ],
            "esrb_rating": {
                "id": 3,
                "name": "Teen",
                "slug": "teen"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/screenshots/aa7/aa79f4bd5f66ad92f712aee34cc6c3b1.jpg"
                },
                {
                    "id": 50440,
                    "image": "https://media.rawg.io/media/screenshots/122/122c6c91e83b52f3ddde0c01c3824200.jpg"
                },
                {
                    "id": 50442,
                    "image": "https://media.rawg.io/media/screenshots/9a3/9a39f0fd5f4254cf43656b9ad7c22522.jpg"
                },
                {
                    "id": 50445,
                    "image": "https://media.rawg.io/media/screenshots/b9e/b9ee66b9b037339ff159f9f23dde4df9.jpg"
                },
                {
                    "id": 50450,
                    "image": "https://media.rawg.io/media/screenshots/10e/10e917b751c798b9c94d50038a3007d2.jpg"
                },
                {
                    "id": 50455,
                    "image": "https://media.rawg.io/media/screenshots/51c/51c9043af223c915c7d8d69b07d8bce2.jpg"
                },
                {
                    "id": 50458,
                    "image": "https://media.rawg.io/media/screenshots/5b5/5b5c2507284d30cae01a918243f0f866.jpg"
                }
            ]
        },
        {
            "id": 10090,
            "slug": "beholder",
            "name": "Beholder",
            "released": "2016-11-08",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/40a/40ab95c1639aa1d7ec04d4cd523af6b1.jpg",
            "rating": 3.79,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 246,
                    "percent": 61.04
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 65,
                    "percent": 16.13
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 64,
                    "percent": 15.88
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 28,
                    "percent": 6.95
                }
            ],
            "ratings_count": 402,
            "reviews_text_count": 1,
            "added": 2473,
            "added_by_status": {
                "yet": 198,
                "owned": 1856,
                "beaten": 164,
                "toplay": 71,
                "dropped": 162,
                "playing": 22
            },
            "metacritic": 75,
            "playtime": 5,
            "suggestions_count": 333,
            "updated": "2020-02-13T04:39:55",
            "user_game": null,
            "reviews_count": 403,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 3,
                        "name": "iOS",
                        "slug": "ios",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70857,
                        "image_background": "https://media.rawg.io/media/games/be0/be084b850302abe81675bc4ffc08a0d0.jpg"
                    },
                    "released_at": "2016-11-08",
                    "requirements_en": {
                        "minimum": "iPhone 5, iPad Fourth Gen, iPad Fourth Gen 4G, iPhone 5c, iPhone 5s, iPad Air, iPad Air Cellular, iPad Mini Retina, iPad Mini Retina Cellular, iPhone 6, iPhone 6 Plus, iPad Air 2, iPad Air 2 Cellular, iPad Mini 3, iPad Mini 3 Cellular, iPod Touch Sixth Gen, iPhone 6s, iPhone 6s Plus, iPad Mini 4, iPad Mini 4 Cellular, iPad Pro, iPad Pro Cellular, iPad Pro 9.7, iPad Pro 9.7 Cellular, iPhone SE, iPhone 7, iPhone 7 Plus, iPad 6 1 1, iPad 6 1 2, iPad 7 1, iPad 7 2, iPad 7 3, iPad 7 4, iPhone 8, iPhone 8 Plus, iPhone X, iPad 7 5, iPad 7 6, iPhone X S, iPhone X S Max, iPhone X R, iPad 8 1 2, iPad 8 3 4, iPad 8 5 6, iPad 8 7 8, iPad Mini 5, iPad Mini 5 Cellular, iPad Air 3, iPad Air 3 Cellular, iPod Touch Seventh Gen"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2016-11-08",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7/8/10<br></li><li><strong>Processor:</strong> Intel Pentium Dual CPU E2180 2.00GHz<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> GeForce 600M / ATI Radeon HD 5450 (1GB)<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Storage:</strong> 1600 MB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7/8/10<br></li><li><strong>Processor:</strong> Intel Core i5 – 2.4 GHz<br></li><li><strong>Memory:</strong> 3 GB RAM<br></li><li><strong>Graphics:</strong> GeForce GT 730 (1Gb) / Radeon R7 A10-7700K<br></li><li><strong>DirectX:</strong> Version 11<br></li><li><strong>Storage:</strong> 1600 MB available space</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 51051,
                        "image_background": "https://media.rawg.io/media/games/174/174fabfca02d5730531bab2153a7dfcb.jpg"
                    },
                    "released_at": "2016-11-08",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Ubuntu 12.04 LTS or more<br></li><li><strong>Processor:</strong> 1.7 GHz Dual Core<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> 1 Gb<br></li><li><strong>Storage:</strong> 1600 MB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Ubuntu 12.04 LTS  or more<br></li><li><strong>Processor:</strong> Core i5 – 2.5 GHz<br></li><li><strong>Memory:</strong> 3 GB RAM<br></li><li><strong>Graphics:</strong> 1 Gb<br></li><li><strong>Storage:</strong> 1600 MB available space</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4396,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    },
                    "released_at": "2016-11-08",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2016-11-08",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2016-11-08",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2016-11-08",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> MacOSX 10.10 or higher<br></li><li><strong>Processor:</strong> Intel Core i5 – 2.4 GHz<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> AMD Radeon HD 6490M 256 МБ<br></li><li><strong>Storage:</strong> 1600 MB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> MacOSX 10.10 or higher<br></li><li><strong>Processor:</strong> Intel Core i5-2400S, 2.6 GHz<br></li><li><strong>Memory:</strong> 3 GB RAM<br></li><li><strong>Graphics:</strong> AMD Radeon HD 6750M (512 Мб)<br></li><li><strong>Storage:</strong> 1600 MB available space</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37877,
                        "image_background": "https://media.rawg.io/media/games/283/283e7e600366b0da7021883d27159b27.jpg"
                    },
                    "released_at": "2016-11-08",
                    "requirements_en": {
                        "minimum": "4.4 and up"
                    },
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "iOS",
                        "slug": "ios"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 87039,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 36705,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                },
                {
                    "id": 10,
                    "name": "Strategy",
                    "slug": "strategy",
                    "games_count": 37479,
                    "image_background": "https://media.rawg.io/media/games/d03/d030347839f74454afcd1008248b08ae.jpg"
                },
                {
                    "id": 51,
                    "name": "Indie",
                    "slug": "indie",
                    "games_count": 37118,
                    "image_background": "https://media.rawg.io/media/games/63f/63f0e68688cad279ed38cde931dbfcdb.jpg"
                }
            ],
            "stores": [
                {
                    "id": 401760,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8656,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    }
                },
                {
                    "id": 401761,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                },
                {
                    "id": 11010,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                },
                {
                    "id": 36053,
                    "store": {
                        "id": 5,
                        "name": "GOG",
                        "slug": "gog",
                        "domain": "gog.com",
                        "games_count": 3363,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    }
                },
                {
                    "id": 42039,
                    "store": {
                        "id": 8,
                        "name": "Google Play",
                        "slug": "google-play",
                        "domain": "play.google.com",
                        "games_count": 16323,
                        "image_background": "https://media.rawg.io/media/games/e04/e04963f3ac4c4fa83a1dc0b9231e50db.jpg"
                    }
                },
                {
                    "id": 27510,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 69259,
                        "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13627,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10201,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3138,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11890,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 10150,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 45,
                    "name": "2D",
                    "slug": "2d",
                    "language": "eng",
                    "games_count": 111700,
                    "image_background": "https://media.rawg.io/media/screenshots/c97/c97b943741f5fbc936fe054d9d58851d.jpg"
                },
                {
                    "id": 16,
                    "name": "Horror",
                    "slug": "horror",
                    "language": "eng",
                    "games_count": 21934,
                    "image_background": "https://media.rawg.io/media/games/2ad/2ad87a4a69b1104f02435c14c5196095.jpg"
                },
                {
                    "id": 15,
                    "name": "Stealth",
                    "slug": "stealth",
                    "language": "eng",
                    "games_count": 3875,
                    "image_background": "https://media.rawg.io/media/games/fd8/fd882c8267a44621a0de6f9cec77ae90.jpg"
                },
                {
                    "id": 34,
                    "name": "Violent",
                    "slug": "violent",
                    "language": "eng",
                    "games_count": 4485,
                    "image_background": "https://media.rawg.io/media/games/a0e/a0ef08621301a1eab5e04fa5c96978fa.jpeg"
                },
                {
                    "id": 141,
                    "name": "Point & Click",
                    "slug": "point-click",
                    "language": "eng",
                    "games_count": 7019,
                    "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                },
                {
                    "id": 41,
                    "name": "Dark",
                    "slug": "dark",
                    "language": "eng",
                    "games_count": 7406,
                    "image_background": "https://media.rawg.io/media/games/4e6/4e6e8e7f50c237d76f38f3c885dae3d2.jpg"
                },
                {
                    "id": 145,
                    "name": "Choices Matter",
                    "slug": "choices-matter",
                    "language": "eng",
                    "games_count": 1208,
                    "image_background": "https://media.rawg.io/media/games/283/283e7e600366b0da7021883d27159b27.jpg"
                },
                {
                    "id": 119,
                    "name": "Dystopian",
                    "slug": "dystopian",
                    "language": "eng",
                    "games_count": 1012,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 218,
                    "name": "Multiple Endings",
                    "slug": "multiple-endings",
                    "language": "eng",
                    "games_count": 3355,
                    "image_background": "https://media.rawg.io/media/games/14a/14a83c56ff668baaced6e8c8704b6391.jpg"
                },
                {
                    "id": 287,
                    "name": "Political",
                    "slug": "political",
                    "language": "eng",
                    "games_count": 340,
                    "image_background": "https://media.rawg.io/media/screenshots/fa1/fa18ee68509b515539fee6e521b36bf1.jpg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/40a/40ab95c1639aa1d7ec04d4cd523af6b1.jpg"
                },
                {
                    "id": 76722,
                    "image": "https://media.rawg.io/media/screenshots/657/657bc0d71313ca654db38e71d30fce30.jpg"
                },
                {
                    "id": 76723,
                    "image": "https://media.rawg.io/media/screenshots/3d1/3d1233d1dbf6748a2c5b14e90cf78b3f.jpg"
                },
                {
                    "id": 76724,
                    "image": "https://media.rawg.io/media/screenshots/a6c/a6c2f21e66a87c72ab240098aad0b38a.jpg"
                },
                {
                    "id": 76725,
                    "image": "https://media.rawg.io/media/screenshots/c81/c818cc51d38a0a866b5b8c359136f39c.jpg"
                },
                {
                    "id": 76726,
                    "image": "https://media.rawg.io/media/screenshots/089/0899bfe1e2f29a557403629eb9dee743.jpg"
                },
                {
                    "id": 76727,
                    "image": "https://media.rawg.io/media/screenshots/cff/cffb1ff936b8e0fa74ddd519b733d53a.jpg"
                }
            ]
        },
        {
            "id": 19584,
            "slug": "risen-2-dark-waters-2",
            "name": "Risen 2: Dark Waters",
            "released": "2012-04-23",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/224/224bc150dfb159caf58ae504f507847e.jpg",
            "rating": 3.38,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 129,
                    "percent": 46.57
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 78,
                    "percent": 28.16
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 41,
                    "percent": 14.8
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 29,
                    "percent": 10.47
                }
            ],
            "ratings_count": 274,
            "reviews_text_count": 2,
            "added": 2469,
            "added_by_status": {
                "yet": 122,
                "owned": 2063,
                "beaten": 181,
                "toplay": 30,
                "dropped": 71,
                "playing": 2
            },
            "metacritic": 69,
            "playtime": 4,
            "suggestions_count": 679,
            "updated": "2020-01-29T00:56:24",
            "user_game": null,
            "reviews_count": 277,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3625,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    "released_at": "2012-04-23",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2718,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    },
                    "released_at": "2012-04-23",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2012-04-23",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP (with Servicepack 2)<br>\t</li><li><strong>Processor:</strong> Dual Core with 2.1 GHz<br>\t</li><li><strong>Memory:</strong> 2 GB System RAM<br>\t</li><li><strong>Hard Disk Space:</strong> 5.5 GB\t<br>\t</li><li><strong>Video Card:</strong> 512 MB Radeon 3870 / GeForce 8800 GTX<br>\t</li><li><strong>DirectX®:</strong> 9.1c<br>\t</li><li><strong>Sound:</strong> DirectX compatible soundcard<br>\t</li><li><strong>Additional:</strong> Keyboard/mouse or gamepad required Internet Connection required for online activation</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP (with Servicepack 3), Windows Vista (with Servicepack 1), Windows 7<br>\t</li><li><strong>Processor:</strong> Dual Core with 3 GHz<br>\t</li><li><strong>Memory:</strong> 4 GB System RAM<br>\t</li><li><strong>Video Card:</strong> 1024 MB Radeon 4890 / GeForce GTX 260</li></ul>"
                    },
                    "requirements_ru": {
                        "minimum": "Core 2 Duo/Athlon 64 X2 2 ГГц,2 Гб памяти,GeForce 8800 GTX/Radeon HD 3870,5.5 Гб на винчестере",
                        "recommended": "Core 2 Duo/Athlon 64 X2 3 ГГц,4 Гб памяти,GeForce GTX 260/Radeon HD 4890,5.5 Гб на винчестере"
                    }
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 36705,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                }
            ],
            "stores": [
                {
                    "id": 22667,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                },
                {
                    "id": 21961,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                },
                {
                    "id": 25521,
                    "store": {
                        "id": 5,
                        "name": "GOG",
                        "slug": "gog",
                        "domain": "gog.com",
                        "games_count": 3363,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    }
                },
                {
                    "id": 33461,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13627,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3138,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11890,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 10150,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3792,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4399,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7337,
                    "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                },
                {
                    "id": 64,
                    "name": "Fantasy",
                    "slug": "fantasy",
                    "language": "eng",
                    "games_count": 13341,
                    "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3536,
                    "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                },
                {
                    "id": 6,
                    "name": "Exploration",
                    "slug": "exploration",
                    "language": "eng",
                    "games_count": 10579,
                    "image_background": "https://media.rawg.io/media/games/b7d/b7d3f1715fa8381a4e780173a197a615.jpg"
                },
                {
                    "id": 11669,
                    "name": "stats",
                    "slug": "stats",
                    "language": "eng",
                    "games_count": 3665,
                    "image_background": "https://media.rawg.io/media/games/46d/46d98e6910fbc0706e2948a7cc9b10c5.jpg"
                },
                {
                    "id": 97,
                    "name": "Action RPG",
                    "slug": "action-rpg",
                    "language": "eng",
                    "games_count": 3474,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 336,
                    "name": "controller support",
                    "slug": "controller-support",
                    "language": "eng",
                    "games_count": 293,
                    "image_background": "https://media.rawg.io/media/games/8a0/8a02f84a5916ede2f923b88d5f8217ba.jpg"
                },
                {
                    "id": 40,
                    "name": "Dark Fantasy",
                    "slug": "dark-fantasy",
                    "language": "eng",
                    "games_count": 1642,
                    "image_background": "https://media.rawg.io/media/games/ee3/ee3e10193aafc3230ba1cae426967d10.jpg"
                },
                {
                    "id": 204,
                    "name": "Gothic",
                    "slug": "gothic",
                    "language": "eng",
                    "games_count": 435,
                    "image_background": "https://media.rawg.io/media/games/0bb/0bbceedd3e1420df0fdaf66a2e373b2b.jpg"
                },
                {
                    "id": 255,
                    "name": "Pirates",
                    "slug": "pirates",
                    "language": "eng",
                    "games_count": 1432,
                    "image_background": "https://media.rawg.io/media/screenshots/656/65654f69256420c0126eb506c1a72d7f.jpg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/224/224bc150dfb159caf58ae504f507847e.jpg"
                },
                {
                    "id": 183871,
                    "image": "https://media.rawg.io/media/screenshots/7db/7db883d347feb110c19e7fb45027cb62.jpg"
                },
                {
                    "id": 183872,
                    "image": "https://media.rawg.io/media/screenshots/559/559b338cab36250f8719d7941d9378cf.jpg"
                },
                {
                    "id": 183873,
                    "image": "https://media.rawg.io/media/screenshots/f15/f157a060693ca47e92041446fabd3bef.jpg"
                },
                {
                    "id": 183874,
                    "image": "https://media.rawg.io/media/screenshots/93e/93e612065bbab390dda06f0641f0e82e.jpg"
                },
                {
                    "id": 183875,
                    "image": "https://media.rawg.io/media/screenshots/441/44148c2d91b327d812f1171a0017e081.jpg"
                },
                {
                    "id": 183876,
                    "image": "https://media.rawg.io/media/screenshots/106/106a446d67ae13b77d30d7c3f0051da4.jpg"
                }
            ]
        },
        {
            "id": 13079,
            "slug": "everlasting-summer",
            "name": "Everlasting Summer",
            "released": "2013-12-12",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/3b5/3b56220d6038b8b1ad66c4d05ef95215.jpg",
            "rating": 3.94,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 201,
                    "percent": 40.94
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 168,
                    "percent": 34.22
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 84,
                    "percent": 17.11
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 38,
                    "percent": 7.74
                }
            ],
            "ratings_count": 484,
            "reviews_text_count": 1,
            "added": 2466,
            "added_by_status": {
                "yet": 73,
                "owned": 1863,
                "beaten": 411,
                "toplay": 22,
                "dropped": 83,
                "playing": 14
            },
            "metacritic": null,
            "playtime": 4,
            "suggestions_count": 475,
            "updated": "2019-09-17T03:27:43",
            "user_game": null,
            "reviews_count": 491,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37877,
                        "image_background": "https://media.rawg.io/media/games/283/283e7e600366b0da7021883d27159b27.jpg"
                    },
                    "released_at": "2014-11-19",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "iOS",
                        "slug": "ios",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70857,
                        "image_background": "https://media.rawg.io/media/games/be0/be084b850302abe81675bc4ffc08a0d0.jpg"
                    },
                    "released_at": "2014-11-19",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2014-11-19",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> MacOS<br></li><li><strong>Processor:</strong> Pentium® 4 1.5 GHz / Athlon® XP<br></li><li><strong>Memory:</strong> 512 MB RAM<br></li><li><strong>Graphics:</strong> DirectX® 9.0c compatible<br></li><li><strong>Storage:</strong> 877 MB available space<br></li><li><strong>Sound Card:</strong> DirectX® 9.0c compatible</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 51051,
                        "image_background": "https://media.rawg.io/media/games/174/174fabfca02d5730531bab2153a7dfcb.jpg"
                    },
                    "released_at": "2014-11-19",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Linux<br></li><li><strong>Processor:</strong> Pentium® 4 1.5 GHz / Athlon® XP<br></li><li><strong>Memory:</strong> 512 MB RAM<br></li><li><strong>Graphics:</strong> DirectX® 9.0c compatible<br></li><li><strong>Storage:</strong> 877 MB available space<br></li><li><strong>Sound Card:</strong> DirectX® 9.0c compatible</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2013-12-12",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Microsoft® Windows® XP/Vista/7/8/8.1<br></li><li><strong>Processor:</strong> Pentium® 4 1.5 GHz / Athlon® XP<br></li><li><strong>Memory:</strong> 512 MB RAM<br></li><li><strong>Graphics:</strong> DirectX® 9.0c compatible<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Storage:</strong> 877 MB available space<br></li><li><strong>Sound Card:</strong> DirectX® 9.0c compatible</li></ul>"
                    },
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "iOS",
                        "slug": "ios"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 6,
                        "name": "Linux",
                        "slug": "linux"
                    }
                }
            ],
            "genres": [
                {
                    "id": 51,
                    "name": "Indie",
                    "slug": "indie",
                    "games_count": 37118,
                    "image_background": "https://media.rawg.io/media/games/63f/63f0e68688cad279ed38cde931dbfcdb.jpg"
                }
            ],
            "stores": [
                {
                    "id": 14389,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3138,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 10150,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 45,
                    "name": "2D",
                    "slug": "2d",
                    "language": "eng",
                    "games_count": 111700,
                    "image_background": "https://media.rawg.io/media/screenshots/c97/c97b943741f5fbc936fe054d9d58851d.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7337,
                    "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1559,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6483,
                    "image_background": "https://media.rawg.io/media/games/af7/af7a831001c5c32c46e950cc883b8cb7.jpg"
                },
                {
                    "id": 79,
                    "name": "Free to Play",
                    "slug": "free-to-play",
                    "language": "eng",
                    "games_count": 3754,
                    "image_background": "https://media.rawg.io/media/games/26b/26b27e1da9e3727fcb12e3e4e86c8c19.jpg"
                },
                {
                    "id": 134,
                    "name": "Anime",
                    "slug": "anime",
                    "language": "eng",
                    "games_count": 6175,
                    "image_background": "https://media.rawg.io/media/screenshots/12e/12ee2600684863837596c0dbb1923fca.jpg"
                },
                {
                    "id": 44,
                    "name": "Nudity",
                    "slug": "nudity",
                    "language": "eng",
                    "games_count": 2632,
                    "image_background": "https://media.rawg.io/media/games/6cd/6cd653e0aaef5ff8bbd295bf4bcb12eb.jpg"
                },
                {
                    "id": 5,
                    "name": "Replay Value",
                    "slug": "replay-value",
                    "language": "eng",
                    "games_count": 914,
                    "image_background": "https://media.rawg.io/media/games/e04/e04963f3ac4c4fa83a1dc0b9231e50db.jpg"
                },
                {
                    "id": 192,
                    "name": "Mature",
                    "slug": "mature",
                    "language": "eng",
                    "games_count": 900,
                    "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                },
                {
                    "id": 117,
                    "name": "Mystery",
                    "slug": "mystery",
                    "language": "eng",
                    "games_count": 7077,
                    "image_background": "https://media.rawg.io/media/games/c00/c003705c0eaed100397ae408b7b89e90.jpg"
                },
                {
                    "id": 145,
                    "name": "Choices Matter",
                    "slug": "choices-matter",
                    "language": "eng",
                    "games_count": 1208,
                    "image_background": "https://media.rawg.io/media/games/283/283e7e600366b0da7021883d27159b27.jpg"
                },
                {
                    "id": 218,
                    "name": "Multiple Endings",
                    "slug": "multiple-endings",
                    "language": "eng",
                    "games_count": 3355,
                    "image_background": "https://media.rawg.io/media/games/14a/14a83c56ff668baaced6e8c8704b6391.jpg"
                },
                {
                    "id": 90,
                    "name": "Visual Novel",
                    "slug": "visual-novel",
                    "language": "eng",
                    "games_count": 2114,
                    "image_background": "https://media.rawg.io/media/screenshots/bf3/bf37a864502fb7cf395748420a48c650.jpg"
                },
                {
                    "id": 217,
                    "name": "Romance",
                    "slug": "romance",
                    "language": "eng",
                    "games_count": 3566,
                    "image_background": "https://media.rawg.io/media/games/972/972aea3c9eb253e893947bec2d2cfbb9.jpg"
                },
                {
                    "id": 160,
                    "name": "Dating Sim",
                    "slug": "dating-sim",
                    "language": "eng",
                    "games_count": 2404,
                    "image_background": "https://media.rawg.io/media/screenshots/429/4296f25b91bb55893460e6f1cf4273ab.jpg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/3b5/3b56220d6038b8b1ad66c4d05ef95215.jpg"
                },
                {
                    "id": 111062,
                    "image": "https://media.rawg.io/media/screenshots/608/6086163d0473f6fe29266a1a878c27e5.jpg"
                },
                {
                    "id": 111063,
                    "image": "https://media.rawg.io/media/screenshots/c6a/c6a35a71895cd2d0288d62fce7bc9132.jpg"
                },
                {
                    "id": 111064,
                    "image": "https://media.rawg.io/media/screenshots/c46/c46bbfaecdeb417928007ebed4cd32a9.jpg"
                },
                {
                    "id": 111065,
                    "image": "https://media.rawg.io/media/screenshots/052/05282819984067ed51c13d89175d52da.jpg"
                },
                {
                    "id": 111066,
                    "image": "https://media.rawg.io/media/screenshots/ba6/ba67c5c5716527e751b697936ddc0452.jpg"
                },
                {
                    "id": 111067,
                    "image": "https://media.rawg.io/media/screenshots/ba5/ba5dc9f642ee16a3ed2b49d0f306fe97.jpg"
                }
            ]
        },
        {
            "id": 28615,
            "slug": "gears-of-war",
            "name": "Gears of War",
            "released": "2006-11-08",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/988/98834d39955e7f15d3717fac438128aa.jpg",
            "rating": 4.14,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 337,
                    "percent": 53.15
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 210,
                    "percent": 33.12
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 71,
                    "percent": 11.2
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 16,
                    "percent": 2.52
                }
            ],
            "ratings_count": 630,
            "reviews_text_count": 2,
            "added": 2461,
            "added_by_status": {
                "yet": 60,
                "owned": 1606,
                "beaten": 609,
                "toplay": 47,
                "dropped": 125,
                "playing": 14
            },
            "metacritic": 90,
            "playtime": 7,
            "suggestions_count": 664,
            "updated": "2020-08-03T02:19:29",
            "user_game": null,
            "reviews_count": 634,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2718,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    },
                    "released_at": "2006-11-08",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2009-12-29",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2006-11-08",
                    "requirements_en": null,
                    "requirements_ru": {
                        "minimum": "Pentium 4/Athlon XP 2.4 ГГц,1 Гб памяти,3D-ускоритель со 128 Мб памяти,12 Гб на винчестере,Windows XP SP2/Vista",
                        "recommended": "Core 2 Duo/Athlon X2 3 ГГц,3 Гб памяти,3D-ускоритель с 512 Мб памяти,12 Гб на винчестере,Windows XP SP2/Vista,Интернет-соединение"
                    }
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 38783,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 465906,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                },
                {
                    "id": 33996,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 70,
                    "name": "War",
                    "slug": "war",
                    "language": "eng",
                    "games_count": 6633,
                    "image_background": "https://media.rawg.io/media/games/21a/21ad672cedee9b4378abb6c2d2e626ee.jpg"
                },
                {
                    "id": 624,
                    "name": "Monsters",
                    "slug": "monsters",
                    "language": "eng",
                    "games_count": 6579,
                    "image_background": "https://media.rawg.io/media/screenshots/eca/eca5a3a8061951cbca3c38141448637e_3wfi7Pu.jpg"
                },
                {
                    "id": 4336,
                    "name": "invaders",
                    "slug": "invaders",
                    "language": "eng",
                    "games_count": 748,
                    "image_background": "https://media.rawg.io/media/screenshots/94f/94fee85a85c0bbb3ba1141a461d6b8c7.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/988/98834d39955e7f15d3717fac438128aa.jpg"
                },
                {
                    "id": 431483,
                    "image": "https://media.rawg.io/media/screenshots/854/854f930ed3b39cfd00eca91b7a99c7de.jpg"
                },
                {
                    "id": 431484,
                    "image": "https://media.rawg.io/media/screenshots/342/34219a3368b000d8380714aa34fc85d0.jpg"
                },
                {
                    "id": 431485,
                    "image": "https://media.rawg.io/media/screenshots/95d/95d43a23c2777d6e3f0e99505416da3b.jpg"
                },
                {
                    "id": 431486,
                    "image": "https://media.rawg.io/media/screenshots/c4a/c4a31b6dd94540e36695c617dd60f660.jpg"
                },
                {
                    "id": 431487,
                    "image": "https://media.rawg.io/media/screenshots/6c9/6c95c707889a09fb592c04206d90d902.jpg"
                },
                {
                    "id": 431488,
                    "image": "https://media.rawg.io/media/screenshots/e6a/e6a2e2de37eca634f0285adb91263867.jpg"
                }
            ]
        },
        {
            "id": 47137,
            "slug": "fornite-battle-royale",
            "name": "Fortnite Battle Royale",
            "released": "2017-09-26",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/dcb/dcbb67f371a9a28ea38ffd73ee0f53f3.jpg",
            "rating": 3.17,
            "rating_top": 3,
            "ratings": [
                {
                    "id": 3,
                    "title": "meh",
                    "count": 207,
                    "percent": 41.73
                },
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 162,
                    "percent": 32.66
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 83,
                    "percent": 16.73
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 44,
                    "percent": 8.87
                }
            ],
            "ratings_count": 482,
            "reviews_text_count": 12,
            "added": 2460,
            "added_by_status": {
                "yet": 25,
                "owned": 1838,
                "beaten": 79,
                "toplay": 18,
                "dropped": 372,
                "playing": 128
            },
            "metacritic": 82,
            "playtime": 0,
            "suggestions_count": 571,
            "updated": "2021-04-21T09:49:11",
            "user_game": null,
            "reviews_count": 496,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2017-09-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2017-09-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2017-09-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "iOS",
                        "slug": "ios",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 70857,
                        "image_background": "https://media.rawg.io/media/games/be0/be084b850302abe81675bc4ffc08a0d0.jpg"
                    },
                    "released_at": "2017-09-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2017-09-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37877,
                        "image_background": "https://media.rawg.io/media/games/283/283e7e600366b0da7021883d27159b27.jpg"
                    },
                    "released_at": "2017-09-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 186,
                        "name": "Xbox Series S/X",
                        "slug": "xbox-series-x",
                        "image": null,
                        "year_end": null,
                        "year_start": 2020,
                        "games_count": 199,
                        "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                    },
                    "released_at": "2017-09-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 187,
                        "name": "PlayStation 5",
                        "slug": "playstation5",
                        "image": null,
                        "year_end": null,
                        "year_start": 2020,
                        "games_count": 227,
                        "image_background": "https://media.rawg.io/media/games/b1d/b1de33eca64ad293702d9554f5ac5cd5.jpg"
                    },
                    "released_at": "2017-09-26",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4396,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    },
                    "released_at": "2017-09-26",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "iOS",
                        "slug": "ios"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 2,
                    "name": "Shooter",
                    "slug": "shooter",
                    "games_count": 38783,
                    "image_background": "https://media.rawg.io/media/games/120/1201a40e4364557b124392ee50317b99.jpg"
                }
            ],
            "stores": [
                {
                    "id": 39210,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                },
                {
                    "id": 46469,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                },
                {
                    "id": 46907,
                    "store": {
                        "id": 4,
                        "name": "App Store",
                        "slug": "apple-appstore",
                        "domain": "apps.apple.com",
                        "games_count": 69259,
                        "image_background": "https://media.rawg.io/media/games/13a/13a528ac9cf48bbb6be5d35fe029336d.jpg"
                    }
                },
                {
                    "id": 48897,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8656,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    }
                },
                {
                    "id": 295664,
                    "store": {
                        "id": 11,
                        "name": "Epic Games",
                        "slug": "epic-games",
                        "domain": "epicgames.com",
                        "games_count": 530,
                        "image_background": "https://media.rawg.io/media/games/0af/0af85e8edddfa55368e47c539914a220.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25538,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10391,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 37,
                    "name": "Sandbox",
                    "slug": "sandbox",
                    "language": "eng",
                    "games_count": 3536,
                    "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                },
                {
                    "id": 123,
                    "name": "Comedy",
                    "slug": "comedy",
                    "language": "eng",
                    "games_count": 6483,
                    "image_background": "https://media.rawg.io/media/games/af7/af7a831001c5c32c46e950cc883b8cb7.jpg"
                },
                {
                    "id": 571,
                    "name": "3D",
                    "slug": "3d",
                    "language": "eng",
                    "games_count": 39321,
                    "image_background": "https://media.rawg.io/media/screenshots/120/120d930368bc171c42f9caab94e33c65.jpg"
                },
                {
                    "id": 997,
                    "name": "island",
                    "slug": "island",
                    "language": "eng",
                    "games_count": 2120,
                    "image_background": "https://media.rawg.io/media/screenshots/928/92898d8a4b0c0c51166c8241305d549c.jpg"
                },
                {
                    "id": 35162,
                    "name": "Battle Royale",
                    "slug": "battle-royale-2",
                    "language": "eng",
                    "games_count": 169,
                    "image_background": "https://media.rawg.io/media/screenshots/3f0/3f01357aa921da7fbeaad39a4187c351.jpg"
                },
                {
                    "id": 1411,
                    "name": "build",
                    "slug": "build",
                    "language": "eng",
                    "games_count": 3889,
                    "image_background": "https://media.rawg.io/media/screenshots/520/520ed5686073be29438e995febc4426d.jpg"
                },
                {
                    "id": 500,
                    "name": "Solo",
                    "slug": "solo",
                    "language": "eng",
                    "games_count": 1119,
                    "image_background": "https://media.rawg.io/media/games/d22/d22ea1bfb636fbf1a9c235cc304312a8.jpg"
                },
                {
                    "id": 2406,
                    "name": "dance",
                    "slug": "dance",
                    "language": "eng",
                    "games_count": 939,
                    "image_background": "https://media.rawg.io/media/games/dcb/dcbb67f371a9a28ea38ffd73ee0f53f3.jpg"
                },
                {
                    "id": 499,
                    "name": "Team",
                    "slug": "team",
                    "language": "eng",
                    "games_count": 22,
                    "image_background": "https://media.rawg.io/media/games/4ea/4ea507ceebeabb43edbc09468f5aaac6.jpg"
                },
                {
                    "id": 5318,
                    "name": "free-2-play",
                    "slug": "free-2-play",
                    "language": "eng",
                    "games_count": 7,
                    "image_background": "https://media.rawg.io/media/screenshots/f43/f43a8936e86964c6c516fc364ff8f12a.jpg"
                },
                {
                    "id": 1911,
                    "name": "bus",
                    "slug": "bus",
                    "language": "eng",
                    "games_count": 37,
                    "image_background": "https://media.rawg.io/media/screenshots/655/655ec36ab029b995ae255af41c6ceec7.jpg"
                }
            ],
            "esrb_rating": {
                "id": 3,
                "name": "Teen",
                "slug": "teen"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/dcb/dcbb67f371a9a28ea38ffd73ee0f53f3.jpg"
                },
                {
                    "id": 663657,
                    "image": "https://media.rawg.io/media/screenshots/c28/c286227823231c426a88aa873cf1b8d6.jpg"
                },
                {
                    "id": 663658,
                    "image": "https://media.rawg.io/media/screenshots/0bf/0bf03856d787e721c6e16fb45531c6f1.jpg"
                },
                {
                    "id": 663659,
                    "image": "https://media.rawg.io/media/screenshots/b85/b85077de89230bf2b3cdf2c41e77acdc.jpg"
                },
                {
                    "id": 663660,
                    "image": "https://media.rawg.io/media/screenshots/d12/d1229ab5948538540d14a0370ab6e7c4.jpg"
                },
                {
                    "id": 663661,
                    "image": "https://media.rawg.io/media/screenshots/7e1/7e19fc248d16d15376ee7550f515dea1.jpg"
                },
                {
                    "id": 663662,
                    "image": "https://media.rawg.io/media/screenshots/7ac/7acd1c484070110647740d85ac164609.jpg"
                }
            ]
        },
        {
            "id": 13273,
            "slug": "the-uncertain-episode-1-the-last-quiet-day",
            "name": "The Uncertain: Episode 1 - The Last Quiet Day",
            "released": "2016-09-22",
            "tba": false,
            "background_image": "https://media.rawg.io/media/screenshots/72c/72c1405b3524e40c44c7860f2b5fa7f9.jpg",
            "rating": 2.92,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 30,
                    "percent": 38.96
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 25,
                    "percent": 32.47
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 20,
                    "percent": 25.97
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 2,
                    "percent": 2.6
                }
            ],
            "ratings_count": 76,
            "reviews_text_count": 1,
            "added": 2459,
            "added_by_status": {
                "yet": 130,
                "owned": 2276,
                "beaten": 37,
                "toplay": 4,
                "dropped": 10,
                "playing": 2
            },
            "metacritic": null,
            "playtime": 4,
            "suggestions_count": 494,
            "updated": "2019-09-17T04:56:11",
            "user_game": null,
            "reviews_count": 77,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2016-09-22",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7 x64 and UP<br></li><li><strong>Processor:</strong> Intel i3 or AMD equivalent or better<br></li><li><strong>Memory:</strong> 4 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GTX 570 or higher<br></li><li><strong>DirectX:</strong> Version 11<br></li><li><strong>Storage:</strong> 15 GB available space<br></li><li><strong>Sound Card:</strong> Yes</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7 x64 and UP<br></li><li><strong>Processor:</strong> Intel i5 processor or higher / AMD Phenom II X6 or higher<br></li><li><strong>Memory:</strong> 8 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GeForce GTX 9xx or higher<br></li><li><strong>DirectX:</strong> Version 11<br></li><li><strong>Storage:</strong> 15 GB available space<br></li><li><strong>Sound Card:</strong> Yes</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2016-09-22",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> OS X Yosemite or higher<br></li><li><strong>Processor:</strong> i3 and up<br></li><li><strong>Memory:</strong> 4096 MB RAM<br></li><li><strong>Graphics:</strong> Discrete<br></li><li><strong>Storage:</strong> 15 GB available space<br></li><li><strong>Sound Card:</strong> Yes</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> OS X Yosemite or higher<br></li><li><strong>Processor:</strong> i5 and up<br></li><li><strong>Memory:</strong> 8192 MB RAM<br></li><li><strong>Graphics:</strong> Discrete<br></li><li><strong>Storage:</strong> 15 GB available space<br></li><li><strong>Sound Card:</strong> Yes</li></ul>"
                    },
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                }
            ],
            "genres": [
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 87039,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                },
                {
                    "id": 51,
                    "name": "Indie",
                    "slug": "indie",
                    "games_count": 37118,
                    "image_background": "https://media.rawg.io/media/games/63f/63f0e68688cad279ed38cde931dbfcdb.jpg"
                }
            ],
            "stores": [
                {
                    "id": 14596,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13627,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3138,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 10150,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 32,
                    "name": "Sci-fi",
                    "slug": "sci-fi",
                    "language": "eng",
                    "games_count": 10391,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7337,
                    "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                },
                {
                    "id": 141,
                    "name": "Point & Click",
                    "slug": "point-click",
                    "language": "eng",
                    "games_count": 7019,
                    "image_background": "https://media.rawg.io/media/games/562/562553814dd54e001a541e4ee83a591c.jpg"
                },
                {
                    "id": 43,
                    "name": "Post-apocalyptic",
                    "slug": "post-apocalyptic",
                    "language": "eng",
                    "games_count": 1869,
                    "image_background": "https://media.rawg.io/media/games/c73/c73c4ffebfe968ba0982a56c2b5020ef.jpg"
                },
                {
                    "id": 167,
                    "name": "Futuristic",
                    "slug": "futuristic",
                    "language": "eng",
                    "games_count": 2295,
                    "image_background": "https://media.rawg.io/media/games/943/9432de383089b0a427a3cdf3687b2b73.jpg"
                },
                {
                    "id": 226,
                    "name": "Cyberpunk",
                    "slug": "cyberpunk",
                    "language": "eng",
                    "games_count": 2508,
                    "image_background": "https://media.rawg.io/media/games/26d/26d4437715bee60138dab4a7c8c59c92.jpg"
                },
                {
                    "id": 197,
                    "name": "Robots",
                    "slug": "robots",
                    "language": "eng",
                    "games_count": 5303,
                    "image_background": "https://media.rawg.io/media/screenshots/bac/bac1670a3d55d603171224368cb8bed8.jpg"
                },
                {
                    "id": 232,
                    "name": "Episodic",
                    "slug": "episodic",
                    "language": "eng",
                    "games_count": 354,
                    "image_background": "https://media.rawg.io/media/games/ea3/ea3228b5c6c749019a9ed42e90a4e7c6.jpg"
                },
                {
                    "id": 140,
                    "name": "Hidden Object",
                    "slug": "hidden-object",
                    "language": "eng",
                    "games_count": 1043,
                    "image_background": "https://media.rawg.io/media/screenshots/ecb/ecb1a53299b7533c25b8c37112ff65a2.jpg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/screenshots/72c/72c1405b3524e40c44c7860f2b5fa7f9.jpg"
                },
                {
                    "id": 112971,
                    "image": "https://media.rawg.io/media/screenshots/280/28027426c7741d9207dccba09b0a6640.jpg"
                },
                {
                    "id": 112972,
                    "image": "https://media.rawg.io/media/screenshots/f88/f88672a61ad373b7a4ededd7d6ed6ca2.jpg"
                },
                {
                    "id": 112973,
                    "image": "https://media.rawg.io/media/screenshots/52d/52d1f1dc18d9632c9e6cf5d97d94cce8.jpg"
                },
                {
                    "id": 112974,
                    "image": "https://media.rawg.io/media/screenshots/835/835a2ac026071159e5fdecf803050aad.jpg"
                },
                {
                    "id": 112975,
                    "image": "https://media.rawg.io/media/screenshots/51a/51ab7f94b0ac87157ab51f1e411bdaa5.jpg"
                },
                {
                    "id": 112976,
                    "image": "https://media.rawg.io/media/screenshots/d25/d25085b0a7cf1502dc4a00f28afd201b.jpg"
                }
            ]
        },
        {
            "id": 9465,
            "slug": "grim-dawn",
            "name": "Grim Dawn",
            "released": "2016-02-24",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/920/92039cd19460532b76f6244b2bb3e4ac.jpg",
            "rating": 3.97,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 234,
                    "percent": 57.35
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 93,
                    "percent": 22.79
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 68,
                    "percent": 16.67
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 13,
                    "percent": 3.19
                }
            ],
            "ratings_count": 406,
            "reviews_text_count": 2,
            "added": 2457,
            "added_by_status": {
                "yet": 121,
                "owned": 1913,
                "beaten": 170,
                "toplay": 53,
                "dropped": 136,
                "playing": 64
            },
            "metacritic": 83,
            "playtime": 7,
            "suggestions_count": 607,
            "updated": "2019-11-18T15:56:10",
            "user_game": null,
            "reviews_count": 408,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2016-02-24",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP / Windows Vista / Windows 7 / Windows 8 / Windows 10<br></li><li><strong>Processor:</strong> x86 compatible 2.3GHz or faster processor (Intel 2nd generation core i-series or equivalent)<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> 512MB NVIDIA GeForce 6800 series or ATI Radeon X800 series or better<br></li><li><strong>DirectX:</strong> Version 9.0c<br></li><li><strong>Storage:</strong> 5 GB available space<br></li><li><strong>Sound Card:</strong> DirectX 9.0c compatible 16-bit sound card<br></li><li><strong>Additional Notes:</strong> 4GB of memory is required to host multiplayer games</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7 / Windows 10<br></li><li><strong>Processor:</strong> x86 compatible 3.2GHz or faster processor (Intel 4th generation core i-series or better)<br></li><li><strong>Memory:</strong> 6 GB RAM<br></li><li><strong>Graphics:</strong> 1.5GB NVIDIA GeForce 500 series or ATI Radeon 6000 series or better<br></li><li><strong>DirectX:</strong> Version 11<br></li><li><strong>Network:</strong> Broadband Internet connection<br></li><li><strong>Storage:</strong> 5 GB available space<br></li><li><strong>Additional Notes:</strong> 4GB of memory is recommended to host multiplayer games</li></ul>"
                    },
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 36705,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                },
                {
                    "id": 51,
                    "name": "Indie",
                    "slug": "indie",
                    "games_count": 37118,
                    "image_background": "https://media.rawg.io/media/games/63f/63f0e68688cad279ed38cde931dbfcdb.jpg"
                }
            ],
            "stores": [
                {
                    "id": 26638,
                    "store": {
                        "id": 5,
                        "name": "GOG",
                        "slug": "gog",
                        "domain": "gog.com",
                        "games_count": 3363,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    }
                },
                {
                    "id": 10302,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25538,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13627,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10201,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11890,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6731,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2813,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 64,
                    "name": "Fantasy",
                    "slug": "fantasy",
                    "language": "eng",
                    "games_count": 13341,
                    "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                },
                {
                    "id": 97,
                    "name": "Action RPG",
                    "slug": "action-rpg",
                    "language": "eng",
                    "games_count": 3474,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 63,
                    "name": "Zombies",
                    "slug": "zombies",
                    "language": "eng",
                    "games_count": 6837,
                    "image_background": "https://media.rawg.io/media/games/198/1988a337305e008b41d7f536ce9b73f6.jpg"
                },
                {
                    "id": 41,
                    "name": "Dark",
                    "slug": "dark",
                    "language": "eng",
                    "games_count": 7406,
                    "image_background": "https://media.rawg.io/media/games/4e6/4e6e8e7f50c237d76f38f3c885dae3d2.jpg"
                },
                {
                    "id": 68,
                    "name": "Hack and Slash",
                    "slug": "hack-and-slash",
                    "language": "eng",
                    "games_count": 1867,
                    "image_background": "https://media.rawg.io/media/games/569/569ea25d2b56bd05c7fa309ddabe81ff.jpg"
                },
                {
                    "id": 43,
                    "name": "Post-apocalyptic",
                    "slug": "post-apocalyptic",
                    "language": "eng",
                    "games_count": 1869,
                    "image_background": "https://media.rawg.io/media/games/c73/c73c4ffebfe968ba0982a56c2b5020ef.jpg"
                },
                {
                    "id": 99,
                    "name": "Isometric",
                    "slug": "isometric",
                    "language": "eng",
                    "games_count": 2294,
                    "image_background": "https://media.rawg.io/media/games/920/92039cd19460532b76f6244b2bb3e4ac.jpg"
                },
                {
                    "id": 40,
                    "name": "Dark Fantasy",
                    "slug": "dark-fantasy",
                    "language": "eng",
                    "games_count": 1642,
                    "image_background": "https://media.rawg.io/media/games/ee3/ee3e10193aafc3230ba1cae426967d10.jpg"
                },
                {
                    "id": 334,
                    "name": "achievements",
                    "slug": "achievements",
                    "language": "eng",
                    "games_count": 4717,
                    "image_background": "https://media.rawg.io/media/games/c35/c354856af9151dc63844be4f9843d2c2.jpg"
                },
                {
                    "id": 96,
                    "name": "Kickstarter",
                    "slug": "kickstarter",
                    "language": "eng",
                    "games_count": 529,
                    "image_background": "https://media.rawg.io/media/screenshots/e5b/e5be8c031ac0dbd85bf058947d480375.jpg"
                },
                {
                    "id": 48,
                    "name": "Dungeon Crawler",
                    "slug": "dungeon-crawler",
                    "language": "eng",
                    "games_count": 3703,
                    "image_background": "https://media.rawg.io/media/games/a0c/a0cb0ac048c75b41d2620d2e6cb6f983.jpg"
                },
                {
                    "id": 98,
                    "name": "Loot",
                    "slug": "loot",
                    "language": "eng",
                    "games_count": 1233,
                    "image_background": "https://media.rawg.io/media/screenshots/ef8/ef8201008461d1c102b6c11c4114d08e.jpg"
                },
                {
                    "id": 59,
                    "name": "Crowdfunded",
                    "slug": "crowdfunded",
                    "language": "eng",
                    "games_count": 56,
                    "image_background": "https://media.rawg.io/media/screenshots/4f7/4f7a84826aa94072bb1f0651b3e2c9f2.jpg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/920/92039cd19460532b76f6244b2bb3e4ac.jpg"
                },
                {
                    "id": 68674,
                    "image": "https://media.rawg.io/media/screenshots/ba0/ba0dee990459147d5635cb62fcac59ea.jpg"
                },
                {
                    "id": 68675,
                    "image": "https://media.rawg.io/media/screenshots/6f2/6f25ebe39eb84e076f623ef7da69d1b2.jpg"
                },
                {
                    "id": 68676,
                    "image": "https://media.rawg.io/media/screenshots/736/736889d10798972a3fb4e1f32ab080e1.jpg"
                },
                {
                    "id": 68677,
                    "image": "https://media.rawg.io/media/screenshots/aaa/aaa91be1b3d1f6a294bb33e2aea604db.jpg"
                },
                {
                    "id": 68678,
                    "image": "https://media.rawg.io/media/screenshots/0a5/0a5c221d7c89a63aa66af8de9dbb63de.jpg"
                },
                {
                    "id": 68679,
                    "image": "https://media.rawg.io/media/screenshots/c73/c739c75886e2c0ce4eea41d5879712cc.jpg"
                }
            ]
        },
        {
            "id": 22597,
            "slug": "darksiders-iii",
            "name": "Darksiders III",
            "released": "2018-11-27",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/cb7/cb770f3f9871e1130f40812b05e401b2.jpg",
            "rating": 3.41,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 162,
                    "percent": 42.41
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 147,
                    "percent": 38.48
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 38,
                    "percent": 9.95
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 35,
                    "percent": 9.16
                }
            ],
            "ratings_count": 374,
            "reviews_text_count": 6,
            "added": 2453,
            "added_by_status": {
                "yet": 211,
                "owned": 1694,
                "beaten": 191,
                "toplay": 179,
                "dropped": 146,
                "playing": 32
            },
            "metacritic": 68,
            "playtime": 5,
            "suggestions_count": 389,
            "updated": "2019-10-21T19:00:39",
            "user_game": null,
            "reviews_count": 382,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2018-11-27",
                    "requirements_en": {
                        "minimum": "7 / 8 / 10 64-bit<br />Processor: Intel Core i5-2400, AMD FX-6100, or better<br />Memory: 6 GB RAM<br />Graphics: Recent Shader Model 5 GPU with 2 GB VRAM<br />DirectX: Version 11<br />Storage: 15 GB available space<br />Additional Notes: These are preliminary system specs that can and will change!"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2018-11-27",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2018-11-27",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 87039,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 36705,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                }
            ],
            "stores": [
                {
                    "id": 25445,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                },
                {
                    "id": 46231,
                    "store": {
                        "id": 5,
                        "name": "GOG",
                        "slug": "gog",
                        "domain": "gog.com",
                        "games_count": 3363,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    }
                },
                {
                    "id": 49407,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                },
                {
                    "id": 49427,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                },
                {
                    "id": 295660,
                    "store": {
                        "id": 11,
                        "name": "Epic Games",
                        "slug": "epic-games",
                        "domain": "epicgames.com",
                        "games_count": 530,
                        "image_background": "https://media.rawg.io/media/games/0af/0af85e8edddfa55368e47c539914a220.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13627,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10201,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11890,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 10150,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 36,
                    "name": "Open World",
                    "slug": "open-world",
                    "language": "eng",
                    "games_count": 3792,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4399,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 26,
                    "name": "Gore",
                    "slug": "gore",
                    "language": "eng",
                    "games_count": 3814,
                    "image_background": "https://media.rawg.io/media/games/c80/c80bcf321da44d69b18a06c04d942662.jpg"
                },
                {
                    "id": 189,
                    "name": "Female Protagonist",
                    "slug": "female-protagonist",
                    "language": "eng",
                    "games_count": 5702,
                    "image_background": "https://media.rawg.io/media/games/a6c/a6ccd34125c594abf1a9c9821b9a715d.jpg"
                },
                {
                    "id": 34,
                    "name": "Violent",
                    "slug": "violent",
                    "language": "eng",
                    "games_count": 4485,
                    "image_background": "https://media.rawg.io/media/games/a0e/a0ef08621301a1eab5e04fa5c96978fa.jpeg"
                },
                {
                    "id": 69,
                    "name": "Action-Adventure",
                    "slug": "action-adventure",
                    "language": "eng",
                    "games_count": 7860,
                    "image_background": "https://media.rawg.io/media/games/276/276150b85a53d81846102f19dbc50d46.jpg"
                },
                {
                    "id": 68,
                    "name": "Hack and Slash",
                    "slug": "hack-and-slash",
                    "language": "eng",
                    "games_count": 1867,
                    "image_background": "https://media.rawg.io/media/games/569/569ea25d2b56bd05c7fa309ddabe81ff.jpg"
                },
                {
                    "id": 43,
                    "name": "Post-apocalyptic",
                    "slug": "post-apocalyptic",
                    "language": "eng",
                    "games_count": 1869,
                    "image_background": "https://media.rawg.io/media/games/c73/c73c4ffebfe968ba0982a56c2b5020ef.jpg"
                },
                {
                    "id": 40,
                    "name": "Dark Fantasy",
                    "slug": "dark-fantasy",
                    "language": "eng",
                    "games_count": 1642,
                    "image_background": "https://media.rawg.io/media/games/ee3/ee3e10193aafc3230ba1cae426967d10.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/cb7/cb770f3f9871e1130f40812b05e401b2.jpg"
                },
                {
                    "id": 216088,
                    "image": "https://media.rawg.io/media/screenshots/528/528df0dae4b19fbe8989b9818c591152.jpg"
                },
                {
                    "id": 216089,
                    "image": "https://media.rawg.io/media/screenshots/ffd/ffdfa4dd8e1ffcf63f031306b301720e.jpg"
                },
                {
                    "id": 216090,
                    "image": "https://media.rawg.io/media/screenshots/160/1604ff0cd69724dd954a825a4b5da7ce.jpg"
                },
                {
                    "id": 216091,
                    "image": "https://media.rawg.io/media/screenshots/678/67834cd7847cbec8f67c4501ca2b0869.jpg"
                },
                {
                    "id": 216092,
                    "image": "https://media.rawg.io/media/screenshots/6dc/6dc2940c87ba69f41b164b309a706c2e.jpg"
                },
                {
                    "id": 216093,
                    "image": "https://media.rawg.io/media/screenshots/cda/cdac0a010f06069905d72034e91e5b97.jpg"
                }
            ]
        },
        {
            "id": 5706,
            "slug": "valkyria-chronicles",
            "name": "Valkyria Chronicles",
            "released": "2008-04-24",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/0d4/0d4e5446db732e2fcce34d1dcb4dd914.jpg",
            "rating": 4.1,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 171,
                    "percent": 50.44
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 113,
                    "percent": 33.33
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 43,
                    "percent": 12.68
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 12,
                    "percent": 3.54
                }
            ],
            "ratings_count": 338,
            "reviews_text_count": 1,
            "added": 2453,
            "added_by_status": {
                "yet": 174,
                "owned": 1834,
                "beaten": 169,
                "toplay": 83,
                "dropped": 155,
                "playing": 38
            },
            "metacritic": 85,
            "playtime": 6,
            "suggestions_count": 396,
            "updated": "2019-09-17T03:26:36",
            "user_game": null,
            "reviews_count": 339,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2008-04-24",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows Vista/Windows 7<br></li><li><strong>Processor:</strong> Intel Core2 Duo @ 2.0GHz (or equivalent)<br></li><li><strong>Memory:</strong> 2 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GeForce GTS 240 (or equivalent)<br></li><li><strong>Storage:</strong> 25 GB available space</li></ul>",
                        "recommended": "<strong>Recommended:</strong><br><ul class=\"bb_ul\"><li><strong>OS:</strong> Windows 7<br></li><li><strong>Processor:</strong> Intel Core2 Duo @ 2.8GHz (or equivalent)<br></li><li><strong>Memory:</strong> 3 GB RAM<br></li><li><strong>Graphics:</strong> NVIDIA GeForce GTX 280 (or equivalent)<br></li><li><strong>Storage:</strong> 25 GB available space</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo Switch",
                        "slug": "nintendo-switch",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4396,
                        "image_background": "https://media.rawg.io/media/games/7a4/7a45e4cdc5b07f316d49cf147b083b27.jpg"
                    },
                    "released_at": "2008-04-24",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3625,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    "released_at": "2008-04-24",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 18,
                        "name": "PlayStation 4",
                        "slug": "playstation4",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 5946,
                        "image_background": "https://media.rawg.io/media/games/929/9295e55ce69cf5337c567983cf8b4137.jpeg"
                    },
                    "released_at": "2008-04-24",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 7,
                        "name": "Nintendo",
                        "slug": "nintendo"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 36705,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                },
                {
                    "id": 10,
                    "name": "Strategy",
                    "slug": "strategy",
                    "games_count": 37479,
                    "image_background": "https://media.rawg.io/media/games/d03/d030347839f74454afcd1008248b08ae.jpg"
                }
            ],
            "stores": [
                {
                    "id": 16522,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                },
                {
                    "id": 6064,
                    "store": {
                        "id": 3,
                        "name": "PlayStation Store",
                        "slug": "playstation-store",
                        "domain": "store.playstation.com",
                        "games_count": 7632,
                        "image_background": "https://media.rawg.io/media/games/d1a/d1a2e99ade53494c6330a0ed945fe823.jpg"
                    }
                },
                {
                    "id": 253189,
                    "store": {
                        "id": 6,
                        "name": "Nintendo Store",
                        "slug": "nintendo",
                        "domain": "nintendo.com",
                        "games_count": 8656,
                        "image_background": "https://media.rawg.io/media/games/8d6/8d69eb6c32ed6acfd75f82d532144993.jpg"
                    }
                },
                {
                    "id": 329087,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 40847,
                    "name": "Steam Achievements",
                    "slug": "steam-achievements",
                    "language": "eng",
                    "games_count": 21914,
                    "image_background": "https://media.rawg.io/media/games/84d/84da2ac3fdfc6507807a1808595afb12.jpg"
                },
                {
                    "id": 7808,
                    "name": "steam-trading-cards",
                    "slug": "steam-trading-cards",
                    "language": "eng",
                    "games_count": 7584,
                    "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                },
                {
                    "id": 40849,
                    "name": "Steam Cloud",
                    "slug": "steam-cloud",
                    "language": "eng",
                    "games_count": 10065,
                    "image_background": "https://media.rawg.io/media/games/4ba/4ba9b4b68ffcc7019b112174883ba4d6.jpg"
                },
                {
                    "id": 40836,
                    "name": "Full controller support",
                    "slug": "full-controller-support",
                    "language": "eng",
                    "games_count": 10201,
                    "image_background": "https://media.rawg.io/media/games/310/3106b0e012271c5ffb16497b070be739.jpg"
                },
                {
                    "id": 42,
                    "name": "Great Soundtrack",
                    "slug": "great-soundtrack",
                    "language": "eng",
                    "games_count": 3138,
                    "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11890,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 10150,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 149,
                    "name": "Third Person",
                    "slug": "third-person",
                    "language": "eng",
                    "games_count": 4399,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1559,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 189,
                    "name": "Female Protagonist",
                    "slug": "female-protagonist",
                    "language": "eng",
                    "games_count": 5702,
                    "image_background": "https://media.rawg.io/media/games/a6c/a6ccd34125c594abf1a9c9821b9a715d.jpg"
                },
                {
                    "id": 80,
                    "name": "Tactical",
                    "slug": "tactical",
                    "language": "eng",
                    "games_count": 2348,
                    "image_background": "https://media.rawg.io/media/games/7ac/7aca7ccf0e70cd0974cb899ab9e5158e.jpg"
                },
                {
                    "id": 134,
                    "name": "Anime",
                    "slug": "anime",
                    "language": "eng",
                    "games_count": 6175,
                    "image_background": "https://media.rawg.io/media/screenshots/12e/12ee2600684863837596c0dbb1923fca.jpg"
                },
                {
                    "id": 468,
                    "name": "role-playing",
                    "slug": "role-playing",
                    "language": "eng",
                    "games_count": 1242,
                    "image_background": "https://media.rawg.io/media/games/c06/c06d88c35785c8003147cb53c84af033.jpg"
                },
                {
                    "id": 102,
                    "name": "Turn-Based",
                    "slug": "turn-based",
                    "language": "eng",
                    "games_count": 3640,
                    "image_background": "https://media.rawg.io/media/games/66e/66e90c9d7b9a17335b310ceb294e9365.jpg"
                },
                {
                    "id": 70,
                    "name": "War",
                    "slug": "war",
                    "language": "eng",
                    "games_count": 6633,
                    "image_background": "https://media.rawg.io/media/games/21a/21ad672cedee9b4378abb6c2d2e626ee.jpg"
                },
                {
                    "id": 101,
                    "name": "Turn-Based Strategy",
                    "slug": "turn-based-strategy",
                    "language": "eng",
                    "games_count": 2469,
                    "image_background": "https://media.rawg.io/media/screenshots/0a6/0a62ee096ef629d5c3c44cc4bcc8cbb5.jpg"
                },
                {
                    "id": 233,
                    "name": "JRPG",
                    "slug": "jrpg",
                    "language": "eng",
                    "games_count": 2147,
                    "image_background": "https://media.rawg.io/media/screenshots/3ca/3ca548ad61d376aec77acbb03c774a98.jpeg"
                },
                {
                    "id": 105,
                    "name": "World War II",
                    "slug": "world-war-ii",
                    "language": "eng",
                    "games_count": 588,
                    "image_background": "https://media.rawg.io/media/games/d07/d0790809a13027251b6d0f4dc7538c58.jpg"
                },
                {
                    "id": 217,
                    "name": "Romance",
                    "slug": "romance",
                    "language": "eng",
                    "games_count": 3566,
                    "image_background": "https://media.rawg.io/media/games/972/972aea3c9eb253e893947bec2d2cfbb9.jpg"
                },
                {
                    "id": 55,
                    "name": "Tanks",
                    "slug": "tanks",
                    "language": "eng",
                    "games_count": 2064,
                    "image_background": "https://media.rawg.io/media/games/c3b/c3be1d5f55cb9324c97ccb7aaaf42ad4.jpg"
                },
                {
                    "id": 230,
                    "name": "Tactical RPG",
                    "slug": "tactical-rpg",
                    "language": "eng",
                    "games_count": 712,
                    "image_background": "https://media.rawg.io/media/screenshots/0fb/0fbc557f78de00eac6b6ae7de6c1dcb5.jpg"
                },
                {
                    "id": 231,
                    "name": "Strategy RPG",
                    "slug": "strategy-rpg",
                    "language": "eng",
                    "games_count": 1061,
                    "image_background": "https://media.rawg.io/media/screenshots/583/5836b228128e94ac799e896adc58337b.jpg"
                }
            ],
            "esrb_rating": {
                "id": 1,
                "name": "Everyone",
                "slug": "everyone"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/0d4/0d4e5446db732e2fcce34d1dcb4dd914.jpg"
                },
                {
                    "id": 131745,
                    "image": "https://media.rawg.io/media/screenshots/1d7/1d74b4a506c95870f105b89b57a57b88.jpg"
                },
                {
                    "id": 131746,
                    "image": "https://media.rawg.io/media/screenshots/31b/31bb3a5ce98a4689937bab2f7f32ebd5.jpg"
                },
                {
                    "id": 131747,
                    "image": "https://media.rawg.io/media/screenshots/219/2193457fffe9144d13d72458128f489d.jpg"
                },
                {
                    "id": 131748,
                    "image": "https://media.rawg.io/media/screenshots/dbb/dbbeada76862bc352afc968becbcac01.jpg"
                },
                {
                    "id": 131749,
                    "image": "https://media.rawg.io/media/screenshots/798/798a5f7abc26511fbb5055f181534211.jpg"
                },
                {
                    "id": 1644187,
                    "image": "https://media.rawg.io/media/screenshots/56a/56aef0f0e03872a38cb114ffd73968e7.jpg"
                }
            ]
        },
        {
            "id": 19568,
            "slug": "tom-clancys-splinter-cell-conviction",
            "name": "Tom Clancy's Splinter Cell: Conviction",
            "released": "2010-04-13",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/366/366e521df82c81218984915203aa3644.jpg",
            "rating": 3.84,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 308,
                    "percent": 62.47
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 99,
                    "percent": 20.08
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 69,
                    "percent": 14.0
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 17,
                    "percent": 3.45
                }
            ],
            "ratings_count": 493,
            "reviews_text_count": 0,
            "added": 2451,
            "added_by_status": {
                "yet": 84,
                "owned": 1727,
                "beaten": 512,
                "toplay": 35,
                "dropped": 89,
                "playing": 4
            },
            "metacritic": 83,
            "playtime": 5,
            "suggestions_count": 581,
            "updated": "2020-10-12T10:50:39",
            "user_game": null,
            "reviews_count": 493,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 16,
                        "name": "PlayStation 3",
                        "slug": "playstation3",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 3625,
                        "image_background": "https://media.rawg.io/media/games/7cf/7cfc9220b401b7a300e409e539c9afd5.jpg"
                    },
                    "released_at": "2010-04-13",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 1,
                        "name": "Xbox One",
                        "slug": "xbox-one",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 4591,
                        "image_background": "https://media.rawg.io/media/games/b45/b45575f34285f2c4479c9a5f719d972e.jpg"
                    },
                    "released_at": "2010-04-13",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 21,
                        "name": "Android",
                        "slug": "android",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 37877,
                        "image_background": "https://media.rawg.io/media/games/283/283e7e600366b0da7021883d27159b27.jpg"
                    },
                    "released_at": "2010-04-13",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2010-04-13",
                    "requirements_en": {
                        "minimum": "<strong>Minimum:</strong><br>\t\t\t\t\t<ul class=\"bb_ul\"><li><strong>OS:</strong> Windows XP, Windows Vista, Windows 7<br>\t\t\t\t\t\t</li><li><strong>Processor:</strong> 1.8 GHz Intel Core2 Duo or 2.4 GHz AMD Athlon X2 64<br>\t\t\t\t\t\t</li><li><strong>Memory:</strong> 1.5 GB Windows XP / 2 GB Windows Vista, Windows 7<br>\t\t\t\t\t\t</li><li><strong>Graphics:</strong> 256 MB DirectX 9.0c–compliant video card (512 MB recommended) (see supported list*)<br>\t\t\t\t\t\t</li><li><strong>DirectX®:</strong> DirectX 9.0c<br>\t\t\t\t\t\t</li><li><strong>Hard Drive:</strong> 10 GB<br>\t\t\t\t\t\t</li><li><strong>Sound:</strong> DirectX 9.0c–compliant sound card<br>\t\t\t\t\t\t</li><li><strong>Peripherals Supported:</strong> Mouse, keyboard, headset, 12-button gamepads with analog sticks<br>\t\t\t\t\t\t</li><li><strong>Internet Connection:</strong> Broadband Internet connection<br>\t\t\t\t\t</li></ul>*Supported Video Cards at Time of Release:<br><br>\t\t\t\t\tNVIDIA GeForce 7800 / 7900 / 8 / 9 / GTX series<br><br>\t\t\t\t\tATI RADEON X1800 / X1900 / HD 2000 / HD 4000 / HD 5000 series<br><br>\t\t\t\t\tATI HD 3000 NOT supported at time of release.<br><br>\t\t\t\t\tLaptop versions of these cards may work but are NOT supported. These chipsets are the only ones that will run this game."
                    },
                    "requirements_ru": {
                        "minimum": "Core 2 Duo/Athlon X2 64 2 ГГц,1.5 Гб памяти,GeForce 7800/Radeon X1800,10 Гб на винчестере,интернет-соединение",
                        "recommended": "Core 2 Duo/Athlon X2 64 3 ГГц,3 Гб памяти,GeForce GTX 260/Radeon HD 4870,10 Гб на винчестере,интернет-соединение"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "macOS",
                        "slug": "macos",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 72621,
                        "image_background": "https://media.rawg.io/media/games/88c/88c5b4d7c80276c03ff62aebb1a99ad4.jpg"
                    },
                    "released_at": "2010-04-13",
                    "requirements_en": {
                        "minimum": "<ul class=\"bb_ul\">Does not support Lion X (OS 10.7)\r\n<li><strong>OS:</strong> Only Snow Leopard 10.6.<br>\t\t\t\t\t\t\t\t\t</li><li><strong>Processor:</strong> Intel® Core™2 Duo (Intel Core i7 recommended)<br>\t\t\t\t\t\t\t\t\t</li><li><strong>Memory:</strong> 2 GB (3 GB recommended)<br>\t\t\t\t\t\t\t\t\t</li><li><strong>Graphics:</strong> 512 MB video card (see supported list*)<br>\t\t\t\t\t\t\t\t\t</li><li><strong>Hard Drive:</strong> 10 GB<br>\t\t\t\t\t\t\t\t\t</li><li><strong>Sound:</strong> Any<br>\t\t\t\t\t\t\t\t\t</li><li><strong>Peripherals:</strong> keyboard, mouse<br>\t\t\t\t\t\t\t\t\t</li><li><strong>Other:</strong> Broadband Internet connection with 128 kbps upstream or faster<br>*Supported Video Cards at Time of Release:<br><br>\t\t\t\t\t\t\t\t\tATI® Radeon® HD 2600 series or higher<br><br>\t\t\t\t\t\t\t\t\tNotebook versions of these cards may work but are NOT supported. These chipsets are the only ones that will run this game<br>\t\t\t\t\t\t\t\t\t</li></ul>"
                    },
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2718,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    },
                    "released_at": "2010-04-13",
                    "requirements_en": null,
                    "requirements_ru": null
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 2,
                        "name": "PlayStation",
                        "slug": "playstation"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                },
                {
                    "platform": {
                        "id": 8,
                        "name": "Android",
                        "slug": "android"
                    }
                },
                {
                    "platform": {
                        "id": 5,
                        "name": "Apple Macintosh",
                        "slug": "mac"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 3,
                    "name": "Adventure",
                    "slug": "adventure",
                    "games_count": 87039,
                    "image_background": "https://media.rawg.io/media/games/995/9951d9d55323d08967640f7b9ab3e342.jpg"
                }
            ],
            "stores": [
                {
                    "id": 497689,
                    "store": {
                        "id": 2,
                        "name": "Xbox Store",
                        "slug": "xbox-store",
                        "domain": "microsoft.com",
                        "games_count": 4176,
                        "image_background": "https://media.rawg.io/media/games/c4b/c4b0cab189e73432de3a250d8cf1c84e.jpg"
                    }
                },
                {
                    "id": 21943,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                },
                {
                    "id": 49204,
                    "store": {
                        "id": 7,
                        "name": "Xbox 360 Store",
                        "slug": "xbox360",
                        "domain": "marketplace.xbox.com",
                        "games_count": 1908,
                        "image_background": "https://media.rawg.io/media/games/fc1/fc1307a2774506b5bd65d7e8424664a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25538,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 18,
                    "name": "Co-op",
                    "slug": "co-op",
                    "language": "eng",
                    "games_count": 6731,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 411,
                    "name": "cooperative",
                    "slug": "cooperative",
                    "language": "eng",
                    "games_count": 2813,
                    "image_background": "https://media.rawg.io/media/games/ec3/ec3a7db7b8ab5a71aad622fe7c62632f.jpg"
                },
                {
                    "id": 40845,
                    "name": "Partial Controller Support",
                    "slug": "partial-controller-support",
                    "language": "eng",
                    "games_count": 7337,
                    "image_background": "https://media.rawg.io/media/games/e2d/e2d3f396b16dded0f841c17c9799a882.jpg"
                },
                {
                    "id": 15,
                    "name": "Stealth",
                    "slug": "stealth",
                    "language": "eng",
                    "games_count": 3875,
                    "image_background": "https://media.rawg.io/media/games/fd8/fd882c8267a44621a0de6f9cec77ae90.jpg"
                }
            ],
            "esrb_rating": {
                "id": 4,
                "name": "Mature",
                "slug": "mature"
            },
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/366/366e521df82c81218984915203aa3644.jpg"
                },
                {
                    "id": 183658,
                    "image": "https://media.rawg.io/media/screenshots/95d/95dbd7d6b06f9b86ff38629302de0475.jpg"
                },
                {
                    "id": 183659,
                    "image": "https://media.rawg.io/media/screenshots/989/989debafeb125b79dfd57e8365d0bc29.jpg"
                },
                {
                    "id": 183660,
                    "image": "https://media.rawg.io/media/screenshots/c74/c74eea698dc932a0d919f5a8f85a6640.jpg"
                },
                {
                    "id": 183661,
                    "image": "https://media.rawg.io/media/screenshots/d19/d197efb6396cde533124f061d4604cc6.jpg"
                },
                {
                    "id": 183662,
                    "image": "https://media.rawg.io/media/screenshots/cca/cca622c291251c31b2a22ce88c145f71.jpg"
                },
                {
                    "id": 183663,
                    "image": "https://media.rawg.io/media/screenshots/189/18959474a7e5ce7ae47e7bd3936e05a3.jpg"
                }
            ]
        },
        {
            "id": 19380,
            "slug": "dark-messiah-of-might-magic",
            "name": "Dark Messiah of Might and Magic",
            "released": "2006-10-24",
            "tba": false,
            "background_image": "https://media.rawg.io/media/games/078/078986692ea320a4fa3b819da33c14cc.jpg",
            "rating": 4.27,
            "rating_top": 4,
            "ratings": [
                {
                    "id": 4,
                    "title": "recommended",
                    "count": 222,
                    "percent": 48.26
                },
                {
                    "id": 5,
                    "title": "exceptional",
                    "count": 191,
                    "percent": 41.52
                },
                {
                    "id": 3,
                    "title": "meh",
                    "count": 37,
                    "percent": 8.04
                },
                {
                    "id": 1,
                    "title": "skip",
                    "count": 10,
                    "percent": 2.17
                }
            ],
            "ratings_count": 459,
            "reviews_text_count": 1,
            "added": 2449,
            "added_by_status": {
                "yet": 106,
                "owned": 1760,
                "beaten": 421,
                "toplay": 43,
                "dropped": 106,
                "playing": 13
            },
            "metacritic": 72,
            "playtime": 2,
            "suggestions_count": 596,
            "updated": "2021-04-22T09:21:52",
            "user_game": null,
            "reviews_count": 460,
            "saturated_color": "0f0f0f",
            "dominant_color": "0f0f0f",
            "platforms": [
                {
                    "platform": {
                        "id": 14,
                        "name": "Xbox 360",
                        "slug": "xbox360",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 2718,
                        "image_background": "https://media.rawg.io/media/games/e46/e462e92b46e8df13e78a806191610d47.jpg"
                    },
                    "released_at": "2006-10-24",
                    "requirements_en": null,
                    "requirements_ru": null
                },
                {
                    "platform": {
                        "id": 4,
                        "name": "PC",
                        "slug": "pc",
                        "image": null,
                        "year_end": null,
                        "year_start": null,
                        "games_count": 333079,
                        "image_background": "https://media.rawg.io/media/games/bc0/bc06a29ceac58652b684deefe7d56099.jpg"
                    },
                    "released_at": "2006-10-24",
                    "requirements_en": {
                        "minimum": "<p><strong>Minimum:</strong> AMD Athlon&trade;, Pentium&reg; 2.4 GHz, 512MB RAM, 128MB video card, 7GB HDD Space, Windows XP, Mouse, Keyboard, Internet Connection<br></p>\n\t\t\t\t\t\t\t<p><strong>Recommended:</strong> AMD Athlon&trade;, Pentium&reg; 3.0 GHz, 256mb dx9 video card, 7GB HDD Space, Windows XP, Mouse, Keyboard, Internet Connection<br></p>"
                    },
                    "requirements_ru": {
                        "minimum": "Pentium 4/Athlon XP 2.6 ГГц,512 Мб памяти,3D-ускоритель со 128 Мб памяти,7.3 Гб на винчестере",
                        "recommended": "Pentium 4/Athlon 64 3.2 ГГц,1 Гб памяти,3D-ускоритель с 256 Мб памяти,7.3 Гб на винчестере,Интернет-доступ (от 128 Kbps)"
                    }
                }
            ],
            "parent_platforms": [
                {
                    "platform": {
                        "id": 1,
                        "name": "PC",
                        "slug": "pc"
                    }
                },
                {
                    "platform": {
                        "id": 3,
                        "name": "Xbox",
                        "slug": "xbox"
                    }
                }
            ],
            "genres": [
                {
                    "id": 4,
                    "name": "Action",
                    "slug": "action",
                    "games_count": 118595,
                    "image_background": "https://media.rawg.io/media/games/b8c/b8c243eaa0fbac8115e0cdccac3f91dc.jpg"
                },
                {
                    "id": 5,
                    "name": "RPG",
                    "slug": "role-playing-games-rpg",
                    "games_count": 36705,
                    "image_background": "https://media.rawg.io/media/games/21c/21cc15d233117c6809ec86870559e105.jpg"
                }
            ],
            "stores": [
                {
                    "id": 21679,
                    "store": {
                        "id": 1,
                        "name": "Steam",
                        "slug": "steam",
                        "domain": "store.steampowered.com",
                        "games_count": 51910,
                        "image_background": "https://media.rawg.io/media/games/d82/d82990b9c67ba0d2d09d4e6fa88885a7.jpg"
                    }
                }
            ],
            "clip": null,
            "tags": [
                {
                    "id": 31,
                    "name": "Singleplayer",
                    "slug": "singleplayer",
                    "language": "eng",
                    "games_count": 116541,
                    "image_background": "https://media.rawg.io/media/games/91c/91c4f377c1e09755b60a0102c5252843.jpg"
                },
                {
                    "id": 7,
                    "name": "Multiplayer",
                    "slug": "multiplayer",
                    "language": "eng",
                    "games_count": 25538,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 13,
                    "name": "Atmospheric",
                    "slug": "atmospheric",
                    "language": "eng",
                    "games_count": 13627,
                    "image_background": "https://media.rawg.io/media/games/618/618c2031a07bbff6b4f611f10b6bcdbc.jpg"
                },
                {
                    "id": 24,
                    "name": "RPG",
                    "slug": "rpg",
                    "language": "eng",
                    "games_count": 11890,
                    "image_background": "https://media.rawg.io/media/games/c24/c24ec439abf4a2e92f3429dfa83f7f94.jpg"
                },
                {
                    "id": 118,
                    "name": "Story Rich",
                    "slug": "story-rich",
                    "language": "eng",
                    "games_count": 10150,
                    "image_background": "https://media.rawg.io/media/games/7fa/7fa0b586293c5861ee32490e953a4996.jpg"
                },
                {
                    "id": 8,
                    "name": "First-Person",
                    "slug": "first-person",
                    "language": "eng",
                    "games_count": 13076,
                    "image_background": "https://media.rawg.io/media/games/b7b/b7b8381707152afc7d91f5d95de70e39.jpg"
                },
                {
                    "id": 30,
                    "name": "FPS",
                    "slug": "fps",
                    "language": "eng",
                    "games_count": 7728,
                    "image_background": "https://media.rawg.io/media/games/26d/26d4437715bee60138dab4a7c8c59c92.jpg"
                },
                {
                    "id": 64,
                    "name": "Fantasy",
                    "slug": "fantasy",
                    "language": "eng",
                    "games_count": 13341,
                    "image_background": "https://media.rawg.io/media/games/aa3/aa36ba4b486a03ddfaef274fb4f5afd4.jpg"
                },
                {
                    "id": 193,
                    "name": "Classic",
                    "slug": "classic",
                    "language": "eng",
                    "games_count": 1559,
                    "image_background": "https://media.rawg.io/media/games/4a0/4a0a1316102366260e6f38fd2a9cfdce.jpg"
                },
                {
                    "id": 26,
                    "name": "Gore",
                    "slug": "gore",
                    "language": "eng",
                    "games_count": 3814,
                    "image_background": "https://media.rawg.io/media/games/c80/c80bcf321da44d69b18a06c04d942662.jpg"
                },
                {
                    "id": 15,
                    "name": "Stealth",
                    "slug": "stealth",
                    "language": "eng",
                    "games_count": 3875,
                    "image_background": "https://media.rawg.io/media/games/fd8/fd882c8267a44621a0de6f9cec77ae90.jpg"
                },
                {
                    "id": 97,
                    "name": "Action RPG",
                    "slug": "action-rpg",
                    "language": "eng",
                    "games_count": 3474,
                    "image_background": "https://media.rawg.io/media/games/157/15742f2f67eacff546738e1ab5c19d20.jpg"
                },
                {
                    "id": 68,
                    "name": "Hack and Slash",
                    "slug": "hack-and-slash",
                    "language": "eng",
                    "games_count": 1867,
                    "image_background": "https://media.rawg.io/media/games/569/569ea25d2b56bd05c7fa309ddabe81ff.jpg"
                },
                {
                    "id": 40856,
                    "name": "Valve Anti-Cheat enabled",
                    "slug": "valve-anti-cheat-enabled",
                    "language": "eng",
                    "games_count": 104,
                    "image_background": "https://media.rawg.io/media/games/1a1/1a17e9b6286edb7e1f1e510110ccb0c0.jpg"
                },
                {
                    "id": 40,
                    "name": "Dark Fantasy",
                    "slug": "dark-fantasy",
                    "language": "eng",
                    "games_count": 1642,
                    "image_background": "https://media.rawg.io/media/games/ee3/ee3e10193aafc3230ba1cae426967d10.jpg"
                },
                {
                    "id": 66,
                    "name": "Medieval",
                    "slug": "medieval",
                    "language": "eng",
                    "games_count": 2893,
                    "image_background": "https://media.rawg.io/media/games/ccf/ccf26f6e3d553a04f0033a8107a521b8.jpg"
                },
                {
                    "id": 82,
                    "name": "Magic",
                    "slug": "magic",
                    "language": "eng",
                    "games_count": 4824,
                    "image_background": "https://media.rawg.io/media/games/6cd/6cd653e0aaef5ff8bbd295bf4bcb12eb.jpg"
                },
                {
                    "id": 218,
                    "name": "Multiple Endings",
                    "slug": "multiple-endings",
                    "language": "eng",
                    "games_count": 3355,
                    "image_background": "https://media.rawg.io/media/games/14a/14a83c56ff668baaced6e8c8704b6391.jpg"
                },
                {
                    "id": 185,
                    "name": "Swordplay",
                    "slug": "swordplay",
                    "language": "eng",
                    "games_count": 207,
                    "image_background": "https://media.rawg.io/media/games/345/34589f72fe291f0f38f12488f28c8f43.jpg"
                }
            ],
            "esrb_rating": null,
            "short_screenshots": [
                {
                    "id": -1,
                    "image": "https://media.rawg.io/media/games/078/078986692ea320a4fa3b819da33c14cc.jpg"
                },
                {
                    "id": 180837,
                    "image": "https://media.rawg.io/media/screenshots/46e/46ecaa83c1b46f3cf981f55972c80360.jpg"
                },
                {
                    "id": 180838,
                    "image": "https://media.rawg.io/media/screenshots/f62/f62b65ff24113e3ce3752b8f3ec83805.jpg"
                },
                {
                    "id": 180839,
                    "image": "https://media.rawg.io/media/screenshots/6bd/6bddb7c6c45f6f674d6877776125fd02.jpg"
                },
                {
                    "id": 180840,
                    "image": "https://media.rawg.io/media/screenshots/b55/b5598880ca52ea11aefce37e5f8d1aba.jpg"
                },
                {
                    "id": 180841,
                    "image": "https://media.rawg.io/media/screenshots/f17/f17a1227ae91e8c23461165974d951ad.jpg"
                },
                {
                    "id": 180842,
                    "image": "https://media.rawg.io/media/screenshots/55b/55b648f3192b5e1419ec745dc309c945.jpg"
                }
            ]
        }
    ],
    "seo_title": "All Games",
    "seo_description": "",
    "seo_keywords": "",
    "seo_h1": "All Games",
    "noindex": false,
    "nofollow": false,
    "description": "",
    "filters": {
        "years": [
            {
                "from": 2020,
                "to": 2021,
                "filter": "2020-01-01,2021-12-31",
                "decade": 2020,
                "years": [
                    {
                        "year": 2021,
                        "count": 74497,
                        "nofollow": false
                    },
                    {
                        "year": 2020,
                        "count": 132554,
                        "nofollow": false
                    }
                ],
                "nofollow": true,
                "count": 207051
            },
            {
                "from": 2010,
                "to": 2019,
                "filter": "2010-01-01,2019-12-31",
                "decade": 2010,
                "years": [
                    {
                        "year": 2019,
                        "count": 79469,
                        "nofollow": false
                    },
                    {
                        "year": 2018,
                        "count": 71344,
                        "nofollow": false
                    },
                    {
                        "year": 2017,
                        "count": 56354,
                        "nofollow": true
                    },
                    {
                        "year": 2016,
                        "count": 41186,
                        "nofollow": true
                    },
                    {
                        "year": 2015,
                        "count": 26322,
                        "nofollow": true
                    },
                    {
                        "year": 2014,
                        "count": 15521,
                        "nofollow": true
                    },
                    {
                        "year": 2013,
                        "count": 6256,
                        "nofollow": true
                    },
                    {
                        "year": 2012,
                        "count": 5305,
                        "nofollow": true
                    },
                    {
                        "year": 2011,
                        "count": 4237,
                        "nofollow": true
                    },
                    {
                        "year": 2010,
                        "count": 3810,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 309804
            },
            {
                "from": 2000,
                "to": 2009,
                "filter": "2000-01-01,2009-12-31",
                "decade": 2000,
                "years": [
                    {
                        "year": 2009,
                        "count": 3026,
                        "nofollow": true
                    },
                    {
                        "year": 2008,
                        "count": 1954,
                        "nofollow": true
                    },
                    {
                        "year": 2007,
                        "count": 1489,
                        "nofollow": true
                    },
                    {
                        "year": 2006,
                        "count": 1211,
                        "nofollow": true
                    },
                    {
                        "year": 2005,
                        "count": 1094,
                        "nofollow": true
                    },
                    {
                        "year": 2004,
                        "count": 1099,
                        "nofollow": true
                    },
                    {
                        "year": 2003,
                        "count": 1079,
                        "nofollow": true
                    },
                    {
                        "year": 2002,
                        "count": 943,
                        "nofollow": true
                    },
                    {
                        "year": 2001,
                        "count": 1064,
                        "nofollow": true
                    },
                    {
                        "year": 2000,
                        "count": 940,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 13899
            },
            {
                "from": 1990,
                "to": 1999,
                "filter": "1990-01-01,1999-12-31",
                "decade": 1990,
                "years": [
                    {
                        "year": 1999,
                        "count": 729,
                        "nofollow": true
                    },
                    {
                        "year": 1998,
                        "count": 667,
                        "nofollow": true
                    },
                    {
                        "year": 1997,
                        "count": 824,
                        "nofollow": true
                    },
                    {
                        "year": 1996,
                        "count": 697,
                        "nofollow": true
                    },
                    {
                        "year": 1995,
                        "count": 808,
                        "nofollow": true
                    },
                    {
                        "year": 1994,
                        "count": 755,
                        "nofollow": true
                    },
                    {
                        "year": 1993,
                        "count": 706,
                        "nofollow": true
                    },
                    {
                        "year": 1992,
                        "count": 613,
                        "nofollow": true
                    },
                    {
                        "year": 1991,
                        "count": 537,
                        "nofollow": true
                    },
                    {
                        "year": 1990,
                        "count": 508,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 6844
            },
            {
                "from": 1980,
                "to": 1989,
                "filter": "1980-01-01,1989-12-31",
                "decade": 1980,
                "years": [
                    {
                        "year": 1989,
                        "count": 401,
                        "nofollow": true
                    },
                    {
                        "year": 1988,
                        "count": 302,
                        "nofollow": true
                    },
                    {
                        "year": 1987,
                        "count": 326,
                        "nofollow": true
                    },
                    {
                        "year": 1986,
                        "count": 244,
                        "nofollow": true
                    },
                    {
                        "year": 1985,
                        "count": 222,
                        "nofollow": true
                    },
                    {
                        "year": 1984,
                        "count": 181,
                        "nofollow": true
                    },
                    {
                        "year": 1983,
                        "count": 202,
                        "nofollow": true
                    },
                    {
                        "year": 1982,
                        "count": 143,
                        "nofollow": true
                    },
                    {
                        "year": 1981,
                        "count": 64,
                        "nofollow": true
                    },
                    {
                        "year": 1980,
                        "count": 34,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 2119
            },
            {
                "from": 1970,
                "to": 1979,
                "filter": "1970-01-01,1979-12-31",
                "decade": 1970,
                "years": [
                    {
                        "year": 1979,
                        "count": 15,
                        "nofollow": true
                    },
                    {
                        "year": 1978,
                        "count": 17,
                        "nofollow": true
                    },
                    {
                        "year": 1977,
                        "count": 12,
                        "nofollow": true
                    },
                    {
                        "year": 1976,
                        "count": 7,
                        "nofollow": true
                    },
                    {
                        "year": 1975,
                        "count": 2,
                        "nofollow": true
                    },
                    {
                        "year": 1974,
                        "count": 1,
                        "nofollow": true
                    },
                    {
                        "year": 1973,
                        "count": 1,
                        "nofollow": true
                    },
                    {
                        "year": 1972,
                        "count": 2,
                        "nofollow": true
                    },
                    {
                        "year": 1971,
                        "count": 6,
                        "nofollow": true
                    },
                    {
                        "year": 1970,
                        "count": 1,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 64
            },
            {
                "from": 1960,
                "to": 1969,
                "filter": "1960-01-01,1969-12-31",
                "decade": 1960,
                "years": [
                    {
                        "year": 1962,
                        "count": 1,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 1
            },
            {
                "from": 1950,
                "to": 1959,
                "filter": "1950-01-01,1959-12-31",
                "decade": 1950,
                "years": [
                    {
                        "year": 1957,
                        "count": 1,
                        "nofollow": true
                    }
                ],
                "nofollow": true,
                "count": 1
            }
        ]
    },
    "nofollow_collections": [
        "stores"
    ]
}
""".trimIndent()

@Language("json")
internal val errorResponse = """
{
    "error": "The key parameter is not provided"
}
""".trimIndent()
