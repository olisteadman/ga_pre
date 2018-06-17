import json
# from pprint import pprint # uncomment to perform a manual print test


def animaux(json_raw, sort_by='age', reverse=False):

    json_dct = json.loads(json_raw)
    json_lst = json_dct['animals']
    json_lst.sort(key=lambda x:
                  x['color'][0]['code'] if sort_by == 'color' else
                  x[sort_by],
                  reverse=reverse)
    
    json_dct['animals'] = json_lst
    return json.dumps(json_dct)
    # pprint(json.dumps(json_dct)) # uncomment to perform manual test