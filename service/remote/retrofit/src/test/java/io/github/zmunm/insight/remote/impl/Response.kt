package io.github.zmunm.insight.remote.impl

import org.intellij.lang.annotations.Language

@Language("json")
val gameListResponse = """
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
val gameDetailResponse = """
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
val errorResponse = """
{
    "error": "The key parameter is not provided"
}
""".trimIndent()
